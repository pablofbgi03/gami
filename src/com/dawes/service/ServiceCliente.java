package com.dawes.service;

import com.dawes.dao.ClienteDAO;
import com.dawes.modelo.Cliente;

public interface ServiceCliente extends ClienteDAO {
	public Cliente consultarUsuario(String email);
}