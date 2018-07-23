package com.dawes.service;

import java.util.List;

import com.dawes.dao.PruebadeportivaDAO;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.util.MySqlDAOFactory;

public class ServicePruebadeportivaImpl implements ServicePruebadeportiva {

	MySqlDAOFactory f;
	PruebadeportivaDAO p;

	public ServicePruebadeportivaImpl() {
		f = new MySqlDAOFactory();
		p = f.getPruebadeportivaDAO();
	}

	@Override
	public PruebaDeportiva buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return p.buscarPorId(id);
	}

	@Override
	public List<PruebaDeportiva> buscarTodo() {
		// TODO Auto-generated method stub
		return p.buscarTodo();
	}

	@Override
	public void guardar(PruebaDeportiva objeto) {
		// TODO Auto-generated method stub
		p.guardar(objeto);
	}

	@Override
	public void borrar(PruebaDeportiva objeto) {
		// TODO Auto-generated method stub
		p.borrar(objeto);
	}

	@Override
	public void insertar(PruebaDeportiva objeto) {
		// TODO Auto-generated method stub
		p.insertar(objeto);
	}

	@Override
	public void actualizar(PruebaDeportiva objeto) {
		// TODO Auto-generated method stub
		p.actualizar(objeto);
	}

	@Override
	public List<Multimedia> buscarMultimedias(PruebaDeportiva pruebaDeportiva) {
		// TODO Auto-generated method stub
		return p.buscarMultimedias(pruebaDeportiva);
	}


}
