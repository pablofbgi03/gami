package com.dawes.dao;

import java.util.List;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.util.GenericDAO;

public interface ItinerarioDAO extends GenericDAO<Itinerario, Integer> {
	public List<Parada> buscarParadas(Itinerario itinerario);
}
