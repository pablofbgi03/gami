package com.dawes.pruebaCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.service.ServicePruebacultural;
import com.dawes.service.ServicePruebaculturalImpl;
import com.dawes.util.Accion;

public class MostrarPruebaCulturalAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServicePruebacultural spc = new ServicePruebaculturalImpl();
		ServiceParada sp = new ServiceParadaImpl();
		System.out.println(request.getParameter("id"));
		int id = Integer.parseInt(request.getParameter("idParada"));
		Parada p = sp.buscarPorId(id);
		
		request.setAttribute("idParada", p.getIdparada());
		request.setAttribute("listaPruebasCulturales", sp.buscarPruebasculturales(p));

		return "Administrador/Administrador/MostrarPruebaCultural.jsp";
	}

}
