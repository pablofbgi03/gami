package com.dawes.premios;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Premio;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServicePremio;
import com.dawes.service.ServicePremioImpl;
import com.dawes.util.Accion;

public class InsertarPremiosAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServicePremio su = new ServicePremioImpl();
		ServiceCliente sc = new ServiceClienteImpl();
		Date fechaactivacion = new Date();
		Date fechaconsumo = null;
		Cliente cliente = sc.buscarPorId(Integer.parseInt(request.getParameter("cliente")));

		Premio premio = new Premio(cliente, request.getParameter("nombre"), request.getParameter("descripcion"),
				request.getParameter("imagen"), fechaactivacion, fechaconsumo,
				Integer.parseInt(request.getParameter("puntos")));

		su.insertar(premio);

		return "mostrarPremio.do";
	}

}
