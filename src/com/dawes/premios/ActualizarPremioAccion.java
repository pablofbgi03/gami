package com.dawes.premios;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Premio;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServicePremio;
import com.dawes.service.ServicePremioImpl;
import com.dawes.util.Accion;

public class ActualizarPremioAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServicePremio su = new ServicePremioImpl();
		ServiceCliente sc = new ServiceClienteImpl();

		Date fechaactivacion = null;
		Date fechaconsumo = null;
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		String strFechaactivacion = request.getParameter("fechaactivacion");
		String strFechaconsumo = request.getParameter("fechaconsumo");
		
		try {

			fechaactivacion = (Date) formatoDelTexto.parse(strFechaactivacion);
			fechaconsumo = (Date) formatoDelTexto.parse(strFechaconsumo);

		} catch (ParseException ex) {

			ex.printStackTrace();

		}

		Cliente cliente = sc.buscarPorId(Integer.parseInt(request.getParameter("idcliente")));
		Premio premio = su.buscarPorId(Integer.parseInt(request.getParameter("idpremio")));

		premio.setCliente(cliente);
		premio.setNombre(request.getParameter("nombre"));
		premio.setDescripcion(request.getParameter("descripcion"));
		premio.setFechaactivacion(fechaactivacion);
		
		premio.setFechaconsumo(fechaconsumo);
		premio.setImagen(request.getParameter("imagen"));
		premio.setPuntos(Integer.parseInt(request.getParameter("puntos")));

		su.actualizar(premio);

		return "mostrarPremio.do";
	}

}
