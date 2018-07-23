package com.dawes.clientes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;

import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.util.Accion;

public class MostrarFormularioActualizarClientes extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceCliente sc = new ServiceClienteImpl();
		Cliente cliente = sc.buscarPorId(Integer.parseInt(request.getParameter("idCliente")));
		int id = Integer.parseInt(request.getParameter("idCliente"));
		cliente = sc.buscarPorId(id);
		request.setAttribute("cliente", cliente);
		System.out.println("MostrarFormularioModificar ");
		return "Administrador/Administrador/InsertarCliente.jsp";
	}

}
