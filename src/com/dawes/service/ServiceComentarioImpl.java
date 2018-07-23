package com.dawes.service;

import java.util.List;

import com.dawes.dao.ComentarioDAO;
import com.dawes.modelo.Comentario;
import com.dawes.util.MySqlDAOFactory;

public class ServiceComentarioImpl implements ServiceComentario {
	MySqlDAOFactory f;
	ComentarioDAO r;

	public ServiceComentarioImpl() {
		f = new MySqlDAOFactory();
		r = f.getComentarioDAO();
	}

	@Override
	public Comentario buscarPorId(Integer id) {
		return r.buscarPorId(id);
	}

	@Override
	public List<Comentario> buscarTodo() {
		return r.buscarTodo();
	}

	@Override
	public void insertar(Comentario objeto) {
		r.insertar(objeto);
	}

	@Override
	public void borrar(Comentario objeto) {
		r.borrar(objeto);
	}

	@Override
	public void guardar(Comentario objeto) {
		r.guardar(objeto);
	}

	@Override
	public void actualizar(Comentario objeto) {
		// TODO Auto-generated method stub
		r.actualizar(objeto);
	}

}
