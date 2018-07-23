package com.dawes.paradas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.util.Accion;

public class EliminarParadasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id;
		System.out.println("estamos en borrar parada id "+request.getParameter("id"));
		ServiceParada sp = new ServiceParadaImpl();
		id = Integer.parseInt(request.getParameter("id"));

		sp.borrar(sp.buscarPorId(id));

		return "index.html";
	}

}
