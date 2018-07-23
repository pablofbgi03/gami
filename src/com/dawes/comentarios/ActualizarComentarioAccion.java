package com.dawes.comentarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Premio;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceComentario;
import com.dawes.service.ServiceComentarioImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.service.ServicePremio;
import com.dawes.service.ServicePremioImpl;
import com.dawes.util.Accion;

public class ActualizarComentarioAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceComentario su = new ServiceComentarioImpl();
		ServiceCliente sc = new ServiceClienteImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();

		int id= Integer.parseInt(request.getParameter("idcomentario"));
		Cliente cliente = sc.buscarPorId(Integer.parseInt(request.getParameter("cliente")));
		Multimedia multimedia = sm.buscarPorId(Integer.parseInt(request.getParameter("multimedia")));

		Comentario comentario = su.buscarPorId(id);
		
		comentario.setCliente(cliente);
		comentario.setMultimedia(multimedia);
		comentario.setTexto(request.getParameter("texto"));

		su.actualizar(comentario);

		return "mostrarComentario.do";
	}

}
