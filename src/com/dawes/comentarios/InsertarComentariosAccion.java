package com.dawes.comentarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Comentario;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceComentario;
import com.dawes.service.ServiceComentarioImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.util.Accion;

public class InsertarComentariosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceCliente sc = new ServiceClienteImpl();
		ServiceComentario su = new ServiceComentarioImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();

		int idCliente = Integer.parseInt(request.getParameter("cliente"));
		int idMultimedia = Integer.parseInt(request.getParameter("multimedia"));

		
		Comentario comentario = new Comentario((sc.buscarPorId(idCliente)), (sm.buscarPorId(idMultimedia)), request.getParameter("texto"));

		su.insertar(comentario);

		return "mostrarComentario.do";
	}

}