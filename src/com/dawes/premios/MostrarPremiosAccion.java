package com.dawes.premios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServicePremio;
import com.dawes.service.ServicePremioImpl;
import com.dawes.util.Accion;

public class MostrarPremiosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServicePremio su = new ServicePremioImpl();

		request.setAttribute("listaPremios", su.buscarTodo());

		return "Administrador/Administrador/MostrarPremios.jsp";
	}

}
