package com.dawes.pruebaCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.modelo.PruebaCultural;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.service.ServicePruebacultural;
import com.dawes.service.ServicePruebaculturalImpl;
import com.dawes.util.Accion;

public class InsertarPruebaCulturalAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServicePruebacultural spc = new ServicePruebaculturalImpl();
		ServiceParada sp = new ServiceParadaImpl();

		Integer id = Integer.parseInt(request.getParameter("id"));
		Parada parada = sp.buscarPorId(id);

		String Spuntos = request.getParameter("puntos");
		Integer puntos = Integer.parseInt(Spuntos);

		PruebaCultural pc = new PruebaCultural(parada, request.getParameter("nombre"), request.getParameter("pregunta"),
				request.getParameter("respuesta"), puntos);

		spc.insertar(pc);
		
		
		return "mostrarPruebaCultural.do";
	}
}
