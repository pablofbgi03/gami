package com.dawes.multimedias;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class ActualizarMultimediaAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceCliente sc = new ServiceClienteImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();
		ServicePruebadeportiva sp = new ServicePruebadeportivaImpl();

		Set<Comentario> comentarios = new HashSet<Comentario>(0);
		Set<Voto> votos = new HashSet<Voto>(0);

		Cliente clien = new Cliente();
		PruebaDeportiva pDep = new PruebaDeportiva();

		clien = sc.buscarPorId(Integer.parseInt(request.getParameter("cliente")));
		pDep = sp.buscarPorId(Integer.parseInt(request.getParameter("pruebaDeportiva")));

		Date fecha = new Date();

		int id = Integer.parseInt(request.getParameter("idmultimedia"));
		Multimedia m = sm.buscarPorId(id);
		m.setCliente(clien);
		m.setPruebaDeportiva(pDep);
		m.setFecha(fecha);
		m.setComentario(request.getParameter("comentario"));
		m.setImagen(request.getParameter("imagen"));
		m.setVideo(request.getParameter("video"));
		m.setPuntosacumulados(Integer.parseInt(request.getParameter("imagen")));

		sm.actualizar(m);

		return "mostrarMultimedia.do";
	}

}
