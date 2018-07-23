package com.dawes.service;

import java.util.List;

import com.dawes.dao.NoticiaDAO;
import com.dawes.modelo.Noticia;
import com.dawes.util.MySqlDAOFactory;

public class ServiceNoticiaImp implements ServiceNoticia {

	MySqlDAOFactory f;
	NoticiaDAO n;

	public ServiceNoticiaImp() {
		f = new MySqlDAOFactory();
		n = f.getNoticiaDAO();
	}

	@Override
	public Noticia buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return n.buscarPorId(id);
	}

	@Override
	public List<Noticia> buscarTodo() {
		// TODO Auto-generated method stub
		return n.buscarTodo();
	}

	@Override
	public void guardar(Noticia objeto) {
		n.guardar(objeto);
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Noticia objeto) {
		n.borrar(objeto);
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Noticia objeto) {
		n.insertar(objeto);
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Noticia objeto) {
		// TODO Auto-generated method stub
		n.actualizar(objeto);
	}

}
