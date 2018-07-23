package com.dawes.pruebaDeportiva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Parada;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class InsertarPruebaDeportivaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		ServicePruebadeportiva spd = new ServicePruebadeportivaImpl();
		ServiceParada sp = new ServiceParadaImpl();

		Integer id = Integer.parseInt(request.getParameter("id"));
		Parada parada = sp.buscarPorId(id);

		String fechaInicioString = request.getParameter("fechaInicio");
		Date fechaInicioDate = null;
		SimpleDateFormat formateoFechaInicio = new SimpleDateFormat("yyyy-MM-dd");

		try {
			fechaInicioDate = formateoFechaInicio.parse(fechaInicioString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String fechaFinString = request.getParameter("fechaFin");
		Date fechaFinDate = null;
		SimpleDateFormat formateoFechaFin = new SimpleDateFormat("yyyy-MM-dd");

		try {
			fechaFinDate = formateoFechaFin.parse(fechaFinString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String puntosString = request.getParameter("puntos");
		Integer puntos = Integer.parseInt(puntosString);

		Set<Multimedia> multimedia = new HashSet<Multimedia>(0);

		PruebaDeportiva pd = new PruebaDeportiva(parada, request.getParameter("nombre"), fechaInicioDate, fechaFinDate,
				request.getParameter("explicacion"), puntos, multimedia);

		spd.insertar(pd);

		return "mostrarPruebaDeportiva.do";
	}

}
