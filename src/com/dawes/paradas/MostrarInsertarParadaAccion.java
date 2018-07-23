package com.dawes.paradas;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.util.Accion;

public class MostrarInsertarParadaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceItinerario si = new ServiceItinerarioImpl();
		boolean iti = false;
		if (request.getParameter("id") == null) {
			System.out.println("viene por id "+request.getParameter("id")+(request.getParameter("id") != null));
			Integer id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("id", id);
			iti = true;// lo utilizo para saber si viene por itineraro o por parada
		} else {
			System.out.println("viene por itinerarios");
			List<Itinerario> itinerarios = si.buscarTodo();
			request.setAttribute("itinerarios", itinerarios);
		}
		request.setAttribute("iti", iti);

		return "Administrador/Administrador/InsertarParada.jsp";
	}

}
