package com.dawes.pruebaCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.PruebaCultural;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.service.ServicePruebacultural;
import com.dawes.service.ServicePruebaculturalImpl;
import com.dawes.util.Accion;

public class ActualizarPruebaCulturalAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		request.setAttribute("id",request.getParameter("idParada"));
		System.out.println((request.getParameter("idParada")));
		ServicePruebacultural spc = new ServicePruebaculturalImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		int puntos = Integer.parseInt(request.getParameter("puntos"));
		PruebaCultural pc = spc.buscarPorId(id);
		pc.setNombre(request.getParameter("nombre"));
		pc.setPregunta(request.getParameter("pregunta"));
		pc.setPuntos(puntos);
		pc.setRespuesta(request.getParameter("respuesta"));
		spc.actualizar(pc);
		
		
		System.out.println((request.getParameter("idParada")));
		return "mostrarPruebaCultural.do";
	}

}
