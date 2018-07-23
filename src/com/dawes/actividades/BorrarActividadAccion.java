package com.dawes.actividades;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceActividad;
import com.dawes.service.ServiceActividadImp;
import com.dawes.util.Accion;

public class BorrarActividadAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		int idActividad = Integer.parseInt(request.getParameter("idActividad"));

		ServiceActividad sa = new ServiceActividadImp();

		sa.borrar(sa.buscarPorId(idActividad));

		return "mostrarActividad.do";
	}

}
