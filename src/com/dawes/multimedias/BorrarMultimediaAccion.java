package com.dawes.multimedias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.util.Accion;

public class BorrarMultimediaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		int idMultimedia;

		ServiceMultimedia sm = new ServiceMultimediaImp();
		idMultimedia = Integer.parseInt(request.getParameter("idmultimedia"));

		sm.borrar(sm.buscarPorId(idMultimedia));

		return "BorrarMultimedia.jsp";
	}

}
