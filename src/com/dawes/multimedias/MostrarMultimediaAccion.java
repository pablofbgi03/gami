package com.dawes.multimedias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class MostrarMultimediaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServiceMultimedia sm = new ServiceMultimediaImp();
		ServicePruebadeportiva pr = new ServicePruebadeportivaImpl();
		
		if (request.getParameter("id")!= null) {
			int id = Integer.parseInt(request.getParameter("id"));
			PruebaDeportiva pd = pr.buscarPorId(id);
			request.setAttribute("idPruebaDeportiva", id);
			request.setAttribute("listaMultimedia", pr.buscarMultimedias(pd));
		}else {
			
	
		request.setAttribute("listaMultimedia", sm.buscarTodo());
		}
		return "Administrador/Administrador/MostrarMultimedia.jsp";
	}

}
