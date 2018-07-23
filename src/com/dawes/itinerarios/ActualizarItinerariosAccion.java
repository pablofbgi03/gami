package com.dawes.itinerarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.util.Accion;

public class ActualizarItinerariosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceItinerario si = new ServiceItinerarioImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		Itinerario i = si.buscarPorId(id);
		i.setNombre(request.getParameter("nombre"));
		i.setCategoria(request.getParameter("categoria"));
		i.setDuracion(request.getParameter("duracion"));
		i.setUbicacion(request.getParameter("ubicacion"));
		si.actualizar(i);
		return "mostrarItinerario.do";
	}

}
