package com.dawes.noticias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceNoticia;
import com.dawes.service.ServiceNoticiaImp;
import com.dawes.util.Accion;

public class BorrarNoticiasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceNoticia sn = new ServiceNoticiaImp();
		sn.borrar(sn.buscarPorId(Integer.parseInt(request.getParameter("idnoticia"))));
		request.setAttribute("listaNoticias", sn.buscarTodo());
		System.out.println("Acabamos de borrar");
		return "mostrarNoticias.do";
	}

}
