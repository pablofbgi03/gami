package com.dawes.clientes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.util.Accion;

public class ActualizarClientesAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		ServiceCliente su = new ServiceClienteImpl();
		
		System.out.println("llegue");
		Date fechanacimiento = null;
		
		//Date fecharegistro = null;
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		String strFechanacimiento = request.getParameter("fechanacimiento");
		//String strFecharegistro = request.getParameter("fecharegistro");
		
		try {

			fechanacimiento = (Date) formatoDelTexto.parse(strFechanacimiento);
			//fecharegistro = (Date) formatoDelTexto.parse(strFecharegistro);

		} catch (ParseException ex) {

			ex.printStackTrace();

		}
		
		int id= Integer.parseInt(request.getParameter("idcliente"));
		int puntos = Integer.parseInt(request.getParameter("puntosacumulados"));
		Cliente cliente = su.buscarPorId(id);
		cliente.setFechanacimiento(fechanacimiento);
		//cliente.setFecharegistro(fecharegistro);
		cliente.setNombre(request.getParameter("nombre"));
		cliente.setApellidos(request.getParameter("apellidos"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setPassword(request.getParameter("password"));
		cliente.setTelefono(request.getParameter("telefono"));
		cliente.setCodigopostal(request.getParameter("codigopostal"));
		cliente.setAvatar(request.getParameter("avatar"));
		cliente.setPuntosacumulados(puntos);
		
		
		su.actualizar(cliente);
		
		return "mostrarClientes.do";
	}

}
