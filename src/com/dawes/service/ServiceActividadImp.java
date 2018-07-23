package com.dawes.service;

import java.util.List;

import com.dawes.dao.ActividadDAO;
import com.dawes.modelo.Actividad;
import com.dawes.util.MySqlDAOFactory;

public class ServiceActividadImp implements ServiceActividad {

	MySqlDAOFactory f;
	ActividadDAO a;

	public ServiceActividadImp() {
		f = new MySqlDAOFactory();
		a = f.getActividadDAO();
	}

	@Override
	public Actividad buscarPorId(Integer id) {
		return a.buscarPorId(id);
	}

	@Override
	public List<Actividad> buscarTodo() {
		return a.buscarTodo();
	}

	@Override
	public void guardar(Actividad objeto) {
		a.guardar(objeto);

	}

	@Override
	public void borrar(Actividad objeto) {
		a.borrar(objeto);

	}

	@Override
	public void insertar(Actividad objeto) {
		a.insertar(objeto);

	}

	@Override
	public void actualizar(Actividad objeto) {
		a.actualizar(objeto);

	}

}
