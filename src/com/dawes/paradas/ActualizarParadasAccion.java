package com.dawes.paradas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.util.Accion;

public class ActualizarParadasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceParada sp = new ServiceParadaImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		int n = Integer.parseInt(request.getParameter("numero"));
		Parada p = sp.buscarPorId(id);
		p.setAnecdotario(request.getParameter("anecdotario"));
		p.setGastronomia(request.getParameter("gastronomia"));
		p.setHistoria(request.getParameter("historia"));
		p.setImagen(request.getParameter("imagen"));
		p.setNombre(request.getParameter("nombre"));
		p.setNumeroParada(n);
		p.setUbicacion(request.getParameter("ubicacion"));
		sp.actualizar(p);
		return "mostrarParada.do";
	}

}
