package com.dawes.noticias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceNoticia;
import com.dawes.service.ServiceNoticiaImp;
import com.dawes.util.Accion;

public class MostrarNoticiasIndexAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceNoticia sn = new ServiceNoticiaImp();
		
		request.setAttribute("listaNoticias", sn.buscarTodo());
		
		return "front/noticias.jsp";
	}

}
