package com.dawes.service;

import java.util.List;

import com.dawes.dao.PruebaculturalDAO;
import com.dawes.modelo.PruebaCultural;
import com.dawes.util.MySqlDAOFactory;

public class ServicePruebaculturalImpl implements ServicePruebacultural {

	MySqlDAOFactory f;
	PruebaculturalDAO p;

	public ServicePruebaculturalImpl() {
		f = new MySqlDAOFactory();
		p = f.getPruebaculturalDAO();
	}

	@Override
	public PruebaCultural buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return p.buscarPorId(id);
	}

	@Override
	public List<PruebaCultural> buscarTodo() {
		// TODO Auto-generated method stub
		return p.buscarTodo();
	}

	@Override
	public void guardar(PruebaCultural objeto) {
		// TODO Auto-generated method stub
		p.guardar(objeto);
	}

	@Override
	public void borrar(PruebaCultural objeto) {
		// TODO Auto-generated method stub
		p.borrar(objeto);
	}

	@Override
	public void insertar(PruebaCultural objeto) {
		// TODO Auto-generated method stub
		p.insertar(objeto);
	}

	@Override
	public void actualizar(PruebaCultural objeto) {
		// TODO Auto-generated method stub
		p.actualizar(objeto);
	}

}
