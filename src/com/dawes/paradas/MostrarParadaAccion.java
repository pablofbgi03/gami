package com.dawes.paradas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.util.Accion;

public class MostrarParadaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceParada sp = new ServiceParadaImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		Parada p = sp.buscarPorId(id);
		request.setAttribute("parada", p);

		return "front/parada.jsp";
	}
}