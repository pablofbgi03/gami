package com.dawes.dao;

import com.dawes.modelo.Cliente;
import com.dawes.util.GenericDAO;

public interface ClienteDAO extends GenericDAO<Cliente, Integer> {
	public Cliente consultarUsuario(String email);
}