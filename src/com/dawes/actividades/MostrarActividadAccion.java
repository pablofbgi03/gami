package com.dawes.actividades;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceActividad;
import com.dawes.service.ServiceActividadImp;
import com.dawes.util.Accion;

public class MostrarActividadAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceActividad sa = new ServiceActividadImp();
		request.setAttribute("listaActividades", sa.buscarTodo());
		return "Administrador/Administrador/MostrarActividades.jsp";
	}

}
