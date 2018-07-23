package com.dawes.dao;

import java.util.List;

import com.dawes.modelo.Parada;
import com.dawes.modelo.PruebaCultural;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.util.GenericDAO;

public interface ParadaDAO extends GenericDAO<Parada, Integer> {
	public List<PruebaDeportiva> buscarPruebasdeportivas(Parada parada);

	public List<PruebaCultural> buscarPruebasculturales(Parada parada);
}
