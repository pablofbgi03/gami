package com.dawes.multimedias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class InsertarMultimediaFrontAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceCliente sc = new ServiceClienteImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();
		ServicePruebadeportiva sp = new ServicePruebadeportivaImpl();

		Set<Comentario> comentarios = new HashSet<Comentario>(0);
		Set<Voto> votos = new HashSet<Voto>(0);

		Cliente clien = new Cliente();
		PruebaDeportiva pDep = new PruebaDeportiva();
		
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("comentario"));
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		
		clien = sc.consultarUsuario(request.getSession().getAttribute("email").toString());
		pDep = sp.buscarPorId(id);
		
		Date fecha = new Date();

		Multimedia multi = new Multimedia(clien, pDep, fecha, request.getParameter("comentario"),
				request.getParameter("imagen"), request.getParameter("video"),
				0, comentarios, votos);

		sm.insertar(multi);

		return "front/entrada.html";
	}

}
