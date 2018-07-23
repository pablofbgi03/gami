package com.dawes.itinerarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.util.Accion;

public class MostrarItinerarioParadasAccion extends Accion{
	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceItinerario si = new ServiceItinerarioImpl();
		
		Itinerario itinerario = si.buscarPorId(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("itinerario", itinerario);
		request.setAttribute("listaParadas", si.buscarParadas(itinerario));
		System.out.println(si.buscarParadas(itinerario));

		return "front/itinerario.jsp";
	}
}
