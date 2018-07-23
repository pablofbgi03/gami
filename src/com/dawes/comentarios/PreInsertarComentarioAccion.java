package com.dawes.comentarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.util.Accion;

public class PreInsertarComentarioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
	
		ServiceCliente su = new ServiceClienteImpl();
		ServiceMultimedia mu = new ServiceMultimediaImp();
		
		request.setAttribute("listaClientes", su.buscarTodo());
		request.setAttribute("listaMultimedia", mu.buscarTodo());
		
		return "Administrador/Administrador/InsertarComentario.jsp";
	}

}
