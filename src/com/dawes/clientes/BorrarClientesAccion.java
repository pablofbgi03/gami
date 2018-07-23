package com.dawes.clientes;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.util.Accion;

public class BorrarClientesAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceCliente sc = new ServiceClienteImpl();
		int idUsuario = Integer.parseInt(request.getParameter("idCliente"));
		sc.borrar(sc.buscarPorId(idUsuario));
		// request.setAttribute("listaClientes",sc.buscarTodo());
		System.out.println("Acabamos de borrar");
		return "mostrarClientes.do";
	}

}
