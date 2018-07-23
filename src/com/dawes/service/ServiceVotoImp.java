package com.dawes.service;

import java.util.List;

import com.dawes.dao.VotoDAO;
import com.dawes.modelo.Voto;
import com.dawes.util.MySqlDAOFactory;

public class ServiceVotoImp implements ServiceVoto {

	MySqlDAOFactory f;
	VotoDAO v;

	public ServiceVotoImp() {
		f = new MySqlDAOFactory();
		v = f.getVotoDAO();
	}

	@Override
	public Voto buscarPorId(Integer id) {
		return v.buscarPorId(id);
	}

	@Override
	public List<Voto> buscarTodo() {
		return v.buscarTodo();
	}

	@Override
	public void guardar(Voto objeto) {
		v.guardar(objeto);

	}

	@Override
	public void borrar(Voto objeto) {
		v.borrar(objeto);

	}

	@Override
	public void insertar(Voto objeto) {
		v.insertar(objeto);
	}

	@Override
	public void actualizar(Voto objeto) {
		// TODO Auto-generated method stub
		v.actualizar(objeto);
	}

}
