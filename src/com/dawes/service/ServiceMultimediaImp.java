package com.dawes.service;

import java.util.List;

import com.dawes.dao.MultimediaDAO;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.util.MySqlDAOFactory;

public class ServiceMultimediaImp implements ServiceMultimedia {

	MySqlDAOFactory f;
	MultimediaDAO m;

	public ServiceMultimediaImp() {
		f = new MySqlDAOFactory();
		m = f.getMultimediaDAO();
	}

	@Override
	public Multimedia buscarPorId(Integer id) {
		return m.buscarPorId(id);
	}

	@Override
	public List<Multimedia> buscarTodo() {
		return m.buscarTodo();
	}

	@Override
	public void guardar(Multimedia objeto) {
		m.guardar(objeto);

	}

	@Override
	public void borrar(Multimedia objeto) {
		m.borrar(objeto);

	}

	@Override
	public void insertar(Multimedia objeto) {
		m.insertar(objeto);

	}

	@Override
	public void actualizar(Multimedia objeto) {
		// TODO Auto-generated method stub
		m.actualizar(objeto);
	}

	@Override
	public List<Comentario> buscarComentarios(Multimedia multimedia) {
		// TODO Auto-generated method stub
		return m.buscarComentarios(multimedia);
	}

}
