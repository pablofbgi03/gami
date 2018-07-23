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

public class MostrarParadasAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceItinerario si = new ServiceItinerarioImpl();
		ServiceParada sp = new ServiceParadaImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		Itinerario i = si.buscarPorId(id);
		request.setAttribute("idItinerario", i.getIditinerario());
		System.out.println(i.getIditinerario());
		System.out.println(si.buscarParadas(i));
		request.setAttribute("listaParadas", si.buscarParadas(i));

		return "Administrador/Administrador/MostrarParadas.jsp";
	}
}