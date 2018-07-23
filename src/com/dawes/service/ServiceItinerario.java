package com.dawes.service;

import java.util.List;

import com.dawes.dao.ItinerarioDAO;
import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;

public interface ServiceItinerario extends ItinerarioDAO {
	public List<Parada> buscarParadas(Itinerario itinerario);
	
}
