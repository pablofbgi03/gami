package com.dawes.comentarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceComentario;
import com.dawes.service.ServiceComentarioImpl;
import com.dawes.util.Accion;

public class BorrarComentariosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		int idComentario;

		ServiceComentario su = new ServiceComentarioImpl();
		idComentario = Integer.parseInt(request.getParameter("idcomentario"));

		su.borrar(su.buscarPorId(idComentario));

		return "mostrarComentario.do";
	}

}
