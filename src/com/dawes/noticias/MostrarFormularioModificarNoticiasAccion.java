package com.dawes.noticias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Noticia;
import com.dawes.service.ServiceNoticia;
import com.dawes.service.ServiceNoticiaImp;
import com.dawes.util.Accion;

public class MostrarFormularioModificarNoticiasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceNoticia sn = new ServiceNoticiaImp();
		Noticia noticia = sn.buscarPorId(Integer.parseInt(request.getParameter("idnoticia")));
		String parametro = request.getParameter("idnoticia");
		int id = Integer.parseInt(request.getParameter("idnoticia"));
		noticia = sn.buscarPorId(id);
		request.setAttribute("noticia", noticia);
		System.out.println("MostrarFormularioModificar ");
		return "Administrador/Administrador/InsertarNoticias.jsp";
	}
}
