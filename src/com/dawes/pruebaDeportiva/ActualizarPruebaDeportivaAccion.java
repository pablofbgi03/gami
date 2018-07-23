package com.dawes.pruebaDeportiva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.PruebaDeportiva;
import com.dawes.service.ServicePruebacultural;
import com.dawes.service.ServicePruebaculturalImpl;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class ActualizarPruebaDeportivaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServicePruebadeportiva spd = new ServicePruebadeportivaImpl();

		int id = Integer.parseInt(request.getParameter("id"));
		int puntos = Integer.parseInt(request.getParameter("puntos"));

		String fechaInicioString = request.getParameter("fechaInicio");
		Date fechaInicioDate = null;
		SimpleDateFormat formateoFechaInicio = new SimpleDateFormat("yyyy-MM-dd");

		try {
			fechaInicioDate = formateoFechaInicio.parse(fechaInicioString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String fechaFinString = request.getParameter("fechaFin");
		Date fechaFinDate = null;
		SimpleDateFormat formateoFechaFin = new SimpleDateFormat("yyyy-MM-dd");

		try {
			fechaFinDate = formateoFechaFin.parse(fechaFinString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PruebaDeportiva pc = spd.buscarPorId(id);
		pc.setExplicacion(request.getParameter("explicacion"));
		pc.setFechafin(fechaFinDate);
		pc.setFechainicio(fechaInicioDate);
		pc.setNombre(request.getParameter("nombre"));
		pc.setPuntos(puntos);
		spd.actualizar(pc);
		
		return "mostrarPruebaDeportiva.do";
	}

}
