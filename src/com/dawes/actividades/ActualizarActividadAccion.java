package com.dawes.actividades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.modelo.ClienteHasActividad;
import com.dawes.modelo.Itinerario;
import com.dawes.service.ServiceActividad;
import com.dawes.service.ServiceActividadImp;
import com.dawes.util.Accion;

public class ActualizarActividadAccion extends Accion{

	public String ejecutar(HttpServletRequest request, HttpServletResponse response){
		
		ServiceActividad sa = new ServiceActividadImp();
		
		Set<ClienteHasActividad> cliHasAct = new HashSet<ClienteHasActividad>(0);
		
		Date fechaInicio = new Date();
		Date fechaFin = new Date();
		try {
			
			String fechaStringInicio = request.getParameter("fechaInicio");
			String fechaStringFin = request.getParameter("fechaFin");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			String strFecha = fechaStringInicio;
			fechaInicio = formatoDelTexto.parse(strFecha);
			strFecha = fechaStringFin;
			fechaFin = formatoDelTexto.parse(strFecha);
			
		} catch (ParseException e) {
			System.out.println("Fecha"+e.getCause());
			e.printStackTrace();
		}
		
		int id=Integer.parseInt(request.getParameter("idActividad"));
		Actividad a=sa.buscarPorId(id);
		a.setNombre(request.getParameter("nombre"));
		a.setFechainicio(fechaInicio);
		a.setFechafin(fechaFin);
		a.setUbicacion(request.getParameter("ubicacion"));
		a.setNumparticipantes(Integer.parseInt(request.getParameter("numParticipantes")));
		a.setPrecio(Float.parseFloat(request.getParameter("precio")));
		a.setImagen(request.getParameter("imagen"));
		a.setPuntos(Integer.parseInt(request.getParameter("puntos")));
		a.setClienteHasActividads(cliHasAct);
		
		sa.actualizar(a);
		
		return "mostrarActividad.do";
		
	}
	
}
