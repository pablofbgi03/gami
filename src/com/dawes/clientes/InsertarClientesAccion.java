package com.dawes.clientes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.ClienteHasActividad;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Premio;
import com.dawes.modelo.Rol;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.util.Accion;

public class InsertarClientesAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		/*
		 * Set<Premio> premios = new HashSet<Premio>(0); Set<Voto> votos = new
		 * HashSet<Voto>(0); Set<Comentario> comentarios = new
		 * HashSet<Comentario>(0); Set<ClienteHasActividad> clienteHasActividads
		 * = new HashSet<ClienteHasActividad>(0); Set<Multimedia> multimedias =
		 * new HashSet<Multimedia>(0);
		 */

		ServiceCliente su = new ServiceClienteImpl();

		Rol rol = new Rol();
		rol.setIdrol(01);
		rol.setNombre("Administrador");
		Date fecha = new Date();
		Date fecharegistro = new Date();
		try {
			String fechaNac = request.getParameter("fechanacimiento");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			String strFecha = fechaNac;
			fecha = formatoDelTexto.parse(strFecha);
		} catch (ParseException e) {
			System.out.println("Fecha" + e.getCause());
			e.printStackTrace();
		}

		Cliente usuario = new Cliente(rol, request.getParameter("nombre"), request.getParameter("apellidos"), fecha,
				request.getParameter("email"), request.getParameter("password"), request.getParameter("telefono"),
				request.getParameter("direccion"), request.getParameter("codigopostal"), request.getParameter("avatar"),
				Integer.parseInt(request.getParameter("puntosacumulados")), fecharegistro, new HashSet<>(),
				new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>());

		su.insertar(usuario);
		request.setAttribute("listaClientes", su.buscarTodo());

		return "Administrador/Administrador/MostrarClientes.jsp";
	}

}
