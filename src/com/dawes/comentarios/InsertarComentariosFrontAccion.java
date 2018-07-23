package com.dawes.comentarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceComentario;
import com.dawes.service.ServiceComentarioImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.util.Accion;

public class InsertarComentariosFrontAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceCliente sc = new ServiceClienteImpl();
		ServiceComentario su = new ServiceComentarioImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();

		Cliente clien = new Cliente();
		
		clien = sc.consultarUsuario(request.getSession().getAttribute("email").toString());
		int idMultimedia = Integer.parseInt(request.getParameter("multimedia"));

		Comentario comentario = new Comentario(clien, (sm.buscarPorId(idMultimedia)), request.getParameter("texto"));

		su.insertar(comentario);

		return "front/entrada.html";
	}

}