package com.dawes.paradas;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.modelo.PruebaCultural;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.util.Accion;

public class InsertarParadasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceParada sp = new ServiceParadaImpl();
		ServiceItinerario si = new ServiceItinerarioImpl();

		Integer id = Integer.parseInt(request.getParameter("id"));
		Itinerario itinerario = si.buscarPorId(id);

		int numero = Integer.parseInt(request.getParameter("numero"));

		Set<PruebaCultural> pruebacultural = new HashSet<PruebaCultural>(0);
		Set<PruebaDeportiva> pruebadeportiva = new HashSet<PruebaDeportiva>(0);

		Parada parada = new Parada(itinerario, request.getParameter("nombre"), numero,
				request.getParameter("ubicacion"), request.getParameter("historia"),
				request.getParameter("anecdotario"), request.getParameter("gastronomia"),
				request.getParameter("imagen"), pruebacultural, pruebadeportiva);

		sp.insertar(parada);

		return "mostrarParada.do";
	}

}
