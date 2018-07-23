package com.dawes.premios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServicePremio;
import com.dawes.service.ServicePremioImpl;
import com.dawes.util.Accion;

public class BorrarPremiosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		int idPremio;

		ServicePremio su = new ServicePremioImpl();
		idPremio = Integer.parseInt(request.getParameter("idpremio"));

		su.borrar(su.buscarPorId(idPremio));

		return "mostrarPremio.do";
	}

}
