package com.dawes.noticias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.util.Accion;

public class MostrarFormularioInsertarNoticiaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("vamos a mostrar insertar noticia acci�n");

		return "Administrador/Administrador/InsertarNoticias.jsp";
	}

}
