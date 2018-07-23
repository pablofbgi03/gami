package com.dawes.clientes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.util.Accion;

public class MostrarClientesAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceCliente sc = new ServiceClienteImpl();
		request.setAttribute("listaClientes", sc.buscarTodo());
		System.out.println(sc.buscarTodo());
		
		return "Administrador/Administrador/MostrarClientes.jsp";
	}

}
