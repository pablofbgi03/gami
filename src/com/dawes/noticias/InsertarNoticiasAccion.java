package com.dawes.noticias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.util.Accion;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Noticia;
import com.dawes.service.ServiceNoticia;
import com.dawes.service.ServiceNoticiaImp;

public class InsertarNoticiasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceNoticia sn = new ServiceNoticiaImp();
		Date fechaAlta = new Date();
		Date fecha = new Date();
		System.out.println("Estamos en Insertar noticias");
		String fechaCaducidad = request.getParameter("fechacaducidad");
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		String strFecha = fechaCaducidad;
		try {
			fecha = formatoDelTexto.parse(strFecha);
		} catch (ParseException e) {
			System.out.println("Fecha" + e.getCause());
			e.printStackTrace();
		}

		Noticia noticia = new Noticia(request.getParameter("nombre"), request.getParameter("texto"), fechaAlta, fecha,
				request.getParameter("imagen"));
		sn.insertar(noticia);
		request.setAttribute("listaNoticias", sn.buscarTodo());
		return "Administrador/Administrador/MostrarNoticias.jsp";
	}

}
