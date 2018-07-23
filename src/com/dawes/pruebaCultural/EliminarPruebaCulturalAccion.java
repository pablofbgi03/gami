package com.dawes.pruebaCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServicePruebacultural;
import com.dawes.service.ServicePruebaculturalImpl;
import com.dawes.util.Accion;

public class EliminarPruebaCulturalAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		int id;

		ServicePruebacultural spc = new ServicePruebaculturalImpl();
		id = Integer.parseInt(request.getParameter("id"));

		spc.borrar(spc.buscarPorId(id));

		return "mostrarPruebaCultural.do";
	}
}
