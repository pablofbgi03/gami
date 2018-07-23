package com.dawes.pruebaCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServicePruebacultural;
import com.dawes.service.ServicePruebaculturalImpl;
import com.dawes.util.Accion;

public class MostrarPruebaCulturalUnicaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServicePruebacultural spc = new ServicePruebaculturalImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("pruebacultural", spc.buscarPorId(id));

		return "front/pruebaCulturalDetalle.jsp";
	}

}
