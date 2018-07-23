package com.dawes.service;

import java.util.List;

import com.dawes.dao.ParadaDAO;
import com.dawes.modelo.Parada;
import com.dawes.modelo.PruebaCultural;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.util.MySqlDAOFactory;

public class ServiceParadaImpl implements ServiceParada {

	MySqlDAOFactory f;
	ParadaDAO p;

	public ServiceParadaImpl() {
		f = new MySqlDAOFactory();
		p = f.getParadaDAO();
	}

	@Override
	public Parada buscarPorId(Integer id) {
		return p.buscarPorId(id);
	}

	@Override
	public List<Parada> buscarTodo() {
		return p.buscarTodo();
	}

	@Override
	public void guardar(Parada objeto) {
		p.insertar(objeto);
	}

	@Override
	public void borrar(Parada objeto) {
		p.borrar(objeto);
	}

	@Override
	public void insertar(Parada objeto) {
		p.guardar(objeto);
	}

	@Override
	public List<PruebaDeportiva> buscarPruebasdeportivas(Parada parada) {
		return p.buscarPruebasdeportivas(parada);
	}

	@Override
	public List<PruebaCultural> buscarPruebasculturales(Parada parada) {
		// TODO Auto-generated method stub
		return p.buscarPruebasculturales(parada);
	}

	@Override
	public void actualizar(Parada objeto) {
		// TODO Auto-generated method stub
		p.actualizar(objeto);
	}

}
