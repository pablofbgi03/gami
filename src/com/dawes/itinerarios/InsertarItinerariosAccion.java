package com.dawes.itinerarios;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.util.Accion;

public class InsertarItinerariosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceItinerario si = new ServiceItinerarioImpl();

		Set<Parada> listado = new HashSet<Parada>(0);

		Itinerario itinerario = new Itinerario(request.getParameter("nombre"), request.getParameter("categoria"),
				request.getParameter("duracion"), request.getParameter("ubicacion"), listado);

		si.insertar(itinerario);

		return "mostrarItinerario.do";
	}
}
