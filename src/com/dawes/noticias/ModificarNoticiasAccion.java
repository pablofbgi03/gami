package com.dawes.noticias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Noticia;
import com.dawes.service.ServiceNoticia;
import com.dawes.service.ServiceNoticiaImp;
import com.dawes.util.Accion;

public class ModificarNoticiasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		ServiceNoticia sn = new ServiceNoticiaImp();
		
		Date fechaalta = null;
		Date fechacaducidad = null;
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		String strFechaalta = request.getParameter("fechaalta");
		String strFechacaducidad = request.getParameter("fechacaducidad");
		
		try {

			fechaalta = (Date) formatoDelTexto.parse(strFechaalta);
			fechacaducidad = (Date) formatoDelTexto.parse(strFechacaducidad);

		} catch (ParseException ex) {

			ex.printStackTrace();

		}
		
		
		
		Noticia noticia = sn.buscarPorId(Integer.parseInt(request.getParameter("idnoticia")));
		noticia.setNombre(request.getParameter("nombre"));
		noticia.setTexto(request.getParameter("texto"));
		noticia.setFechaalta(fechaalta);
		noticia.setFechacaducidad(fechacaducidad);
		noticia.setImagen(request.getParameter("imagen"));
		
		sn.actualizar(noticia);
		
		return "mostrarNoticias.do";
	}

}
