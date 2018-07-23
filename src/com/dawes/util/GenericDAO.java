package com.dawes.util;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, Id extends Serializable> {

	T buscarPorId(Id id);

	List<T> buscarTodo();

	void guardar(T objeto);

	void borrar(T objeto);

	void insertar(T objeto);

	void actualizar(T objeto);

}
