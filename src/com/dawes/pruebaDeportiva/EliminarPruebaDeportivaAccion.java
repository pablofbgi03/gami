package com.dawes.pruebaDeportiva;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class EliminarPruebaDeportivaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		int id;

		ServicePruebadeportiva spd = new ServicePruebadeportivaImpl();
		id = Integer.parseInt(request.getParameter("id"));

		spd.borrar(spd.buscarPorId(id));

		return "mostrarPruebaDeportiva.do?";
	}

}
