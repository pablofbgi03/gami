package com.dawes.noticias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceNoticia;
import com.dawes.service.ServiceNoticiaImp;
import com.dawes.util.Accion;

public class MostrarNoticiasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceNoticia sn = new ServiceNoticiaImp();
		request.setAttribute("listaNoticias", sn.buscarTodo());

		System.out.println("Vamos a mostrar las noticias");
		return "Administrador/Administrador/MostrarNoticias.jsp";
	}

}