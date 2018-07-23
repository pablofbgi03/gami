package com.dawes.multimedias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.util.Accion;

public class MostrarMultimediaComentariosAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceMultimedia sm = new ServiceMultimediaImp();
		
		int id = Integer.parseInt(request.getParameter("idmultimedia"));
		
		Multimedia m = sm.buscarPorId(id);
		
		request.setAttribute("multimedia", m);
		request.setAttribute("listaComentarios", sm.buscarComentarios(m));
		
		return "front/multimediaDetalle.jsp";
	}

}
