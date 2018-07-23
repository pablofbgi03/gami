package com.dawes.itinerarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.util.Accion;

public class MostrarItinerariosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceItinerario si = new ServiceItinerarioImpl();
		request.setAttribute("listaItinerarios", si.buscarTodo());

		return "Administrador/Administrador/MostrarItinerarios.jsp";
	}
}
