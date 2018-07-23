package com.dawes.votos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceVoto;
import com.dawes.service.ServiceVotoImp;
import com.dawes.util.Accion;

public class BorrarVotoAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		int idVoto;

		ServiceVoto sv = new ServiceVotoImp();
		idVoto = Integer.parseInt(request.getParameter("idVoto"));

		sv.borrar(sv.buscarPorId(idVoto));

		return "mostrarVoto.do";
	}

}
