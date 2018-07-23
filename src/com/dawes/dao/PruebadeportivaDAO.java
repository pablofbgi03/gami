package com.dawes.dao;

import java.util.List;

import com.dawes.modelo.Multimedia;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.util.GenericDAO;

public interface PruebadeportivaDAO extends GenericDAO<PruebaDeportiva, Integer> {
	public List<Multimedia> buscarMultimedias(PruebaDeportiva pruebaDeportiva);
}
