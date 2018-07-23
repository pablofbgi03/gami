package com.dawes.votos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.service.ServiceVoto;
import com.dawes.service.ServiceVotoImp;
import com.dawes.util.Accion;

public class ActualizarVotoAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceVoto sv = new ServiceVotoImp();
		ServiceCliente sc = new ServiceClienteImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();

		Cliente clien = new Cliente();
		Multimedia multi = new Multimedia();
		Voto voto= sv.buscarPorId(Integer.parseInt(request.getParameter("idvoto")));
		clien = sc.buscarPorId(Integer.parseInt(request.getParameter("cliente")));
		multi = sm.buscarPorId(Integer.parseInt(request.getParameter("multimedia")));

		voto.setCliente(clien);
		voto.setMultimedia(multi);
		voto.setPuntos(Integer.parseInt(request.getParameter("puntos")));
		
		

		sv.actualizar(voto);;

		return "mostrarVoto.do";
	}

}
