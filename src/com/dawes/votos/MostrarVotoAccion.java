package com.dawes.votos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceVoto;
import com.dawes.service.ServiceVotoImp;
import com.dawes.util.Accion;

public class MostrarVotoAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceVoto sv = new ServiceVotoImp();
		request.setAttribute("listaVotos", sv.buscarTodo());

		return "Administrador/Administrador/MostrarVotos.jsp";
	}

}
