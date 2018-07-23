package com.dawes.service;

import java.util.List;

import com.dawes.dao.PremioDAO;
import com.dawes.modelo.Premio;
import com.dawes.util.MySqlDAOFactory;

public class ServicePremioImpl implements ServicePremio {

	MySqlDAOFactory f;
	PremioDAO p;

	public ServicePremioImpl() {
		f = new MySqlDAOFactory();
		p = f.getPremioDAO();
	}

	@Override
	public Premio buscarPorId(Integer id) {
		return p.buscarPorId(id);
	}

	@Override
	public List<Premio> buscarTodo() {
		return p.buscarTodo();
	}

	@Override
	public void insertar(Premio objeto) {
		p.insertar(objeto);

	}

	@Override
	public void borrar(Premio objeto) {
		p.borrar(objeto);

	}

	@Override
	public void guardar(Premio objeto) {
		p.guardar(objeto);

	}

	@Override
	public void actualizar(Premio objeto) {
		// TODO Auto-generated method stub
		p.actualizar(objeto);
	}

}
