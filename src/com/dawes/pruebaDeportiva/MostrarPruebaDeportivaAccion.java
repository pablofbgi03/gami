package com.dawes.pruebaDeportiva;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class MostrarPruebaDeportivaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServicePruebadeportiva spd = new ServicePruebadeportivaImpl();

		ServiceParada sp = new ServiceParadaImpl();
		if (request.getParameter("id") != null) {
			int id = Integer.parseInt(request.getParameter("id"));
			Parada p = sp.buscarPorId(id);

			request.setAttribute("idParada", p.getIdparada());
			request.setAttribute("listaPruebasDeportivas", sp.buscarPruebasdeportivas(p));
		} else
			request.setAttribute("listaPruebasDeportivas", spd.buscarTodo());

		return "Administrador/Administrador/MostrarPruebaDeportiva.jsp";
	}

}
