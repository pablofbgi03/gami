package com.dawes.dao;

import java.util.List;

import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.util.GenericDAO;

public interface MultimediaDAO extends GenericDAO<Multimedia, Integer> {
	public List<Comentario> buscarComentarios(Multimedia multimedia);

}
