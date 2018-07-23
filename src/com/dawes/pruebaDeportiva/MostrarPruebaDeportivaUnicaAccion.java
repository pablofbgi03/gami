package com.dawes.pruebaDeportiva;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.PruebaDeportiva;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class MostrarPruebaDeportivaUnicaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServicePruebadeportiva spd = new ServicePruebadeportivaImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		PruebaDeportiva pd = spd.buscarPorId(id);
		
		request.setAttribute("pruebadeportiva", spd.buscarPorId(id));
		request.setAttribute("listaMultimedia", spd.buscarMultimedias(pd));

		return "front/pruebaDeportivaDetalle.jsp";
	}

}
