package com.dawes.service;

import java.util.List;

import com.dawes.dao.ItinerarioDAO;
import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.util.MySqlDAOFactory;

public class ServiceItinerarioImpl implements ServiceItinerario {

	MySqlDAOFactory f;
	ItinerarioDAO i;

	public ServiceItinerarioImpl() {
		f = new MySqlDAOFactory();
		i = f.getItinerarioDAO();
	}

	@Override
	public List<Parada> buscarParadas(Itinerario itinerario) {
		// TODO Auto-generated method stub
		return i.buscarParadas(itinerario);
	}

	@Override
	public Itinerario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return i.buscarPorId(id);
	}

	@Override
	public List<Itinerario> buscarTodo() {
		// TODO Auto-generated method stub
		return i.buscarTodo();
	}

	@Override
	public void guardar(Itinerario objeto) {
		// TODO Auto-generated method stub
		i.guardar(objeto);
	}

	@Override
	public void borrar(Itinerario objeto) {
		// TODO Auto-generated method stub
		i.borrar(objeto);
	}

	@Override
	public void insertar(Itinerario objeto) {
		// TODO Auto-generated method stub
		i.insertar(objeto);
	}

	@Override
	public void actualizar(Itinerario objeto) {
		// TODO Auto-generated method stub
		i.actualizar(objeto);
	}

}
