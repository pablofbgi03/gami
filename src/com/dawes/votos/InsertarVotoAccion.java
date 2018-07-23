package com.dawes.votos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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

public class InsertarVotoAccion extends Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceVoto sv = new ServiceVotoImp();
		ServiceCliente sc = new ServiceClienteImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();

		Cliente clien = new Cliente();
		Multimedia multi = new Multimedia();

		clien = sc.buscarPorId(Integer.parseInt(request.getParameter("cliente")));
		multi = sm.buscarPorId(Integer.parseInt(request.getParameter("multimedia")));

		Voto voto = new Voto(clien, multi, Integer.parseInt(request.getParameter("puntos")));

		sv.insertar(voto);

		return "mostrarVoto.do";
	}

}
