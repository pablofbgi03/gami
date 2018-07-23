package com.dawes.comentarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.service.ServiceComentario;
import com.dawes.service.ServiceComentarioImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.util.Accion;

public class MostrarComentariosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceComentario su = new ServiceComentarioImpl();
		ServiceMultimedia mu = new ServiceMultimediaImp();
		
		if (request.getParameter("id")!= null) {
			int id = Integer.parseInt(request.getParameter("id"));
			Multimedia mul = mu.buscarPorId(id);
			
			request.setAttribute("listaComentarios", mu.buscarComentarios(mul));
		}else {
		request.setAttribute("listaComentarios", su.buscarTodo());
		}
		return "Administrador/Administrador/MostrarComentarios.jsp";
	
	}
}
