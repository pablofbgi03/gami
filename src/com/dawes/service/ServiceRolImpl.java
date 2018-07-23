package com.dawes.service;

import java.util.List;

import com.dawes.dao.RolDAO;
import com.dawes.modelo.Rol;
import com.dawes.util.MySqlDAOFactory;

public class ServiceRolImpl implements ServiceRol {
	MySqlDAOFactory f;
	RolDAO r;

	public ServiceRolImpl() {
		f = new MySqlDAOFactory();
		r = f.getRolDAO();
	}

	@Override
	public Rol buscarPorId(Integer id) {
		return r.buscarPorId(id);
	}

	@Override
	public List<Rol> buscarTodo() {
		return r.buscarTodo();
	}

	@Override
	public void insertar(Rol objeto) {
		r.insertar(objeto);
	}

	@Override
	public void borrar(Rol objeto) {
		r.borrar(objeto);
	}

	@Override
	public void guardar(Rol objeto) {
		r.guardar(objeto);
	}

	@Override
	public void actualizar(Rol objeto) {
		// TODO Auto-generated method stub
		r.actualizar(objeto);
	}

}
