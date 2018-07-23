package com.dawes.premios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.util.Accion;

public class PreInsertarPremiosAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceCliente su = new ServiceClienteImpl();
		
		request.setAttribute("listaClientes", su.buscarTodo());

		return "Administrador/Administrador/InsertarPremios.jsp";
	}

}
