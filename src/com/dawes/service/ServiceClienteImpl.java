package com.dawes.service;

import java.util.List;

import com.dawes.dao.ClienteDAO;
import com.dawes.modelo.Cliente;
import com.dawes.util.MySqlDAOFactory;

public class ServiceClienteImpl implements ServiceCliente {

	MySqlDAOFactory f;
	ClienteDAO c;

	public ServiceClienteImpl() {
		f = new MySqlDAOFactory();
		c = f.getClienteDAO();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		return c.buscarPorId(id);
	}

	@Override
	public List<Cliente> buscarTodo() {
		return c.buscarTodo();
	}

	@Override
	public void insertar(Cliente objeto) {
		c.insertar(objeto);

	}

	@Override
	public void borrar(Cliente objeto) {
		c.borrar(objeto);
	}

	@Override
	public void guardar(Cliente objeto) {
		c.guardar(objeto);
	}

	@Override
	public void actualizar(Cliente objeto) {
		// TODO Auto-generated method stub
		c.actualizar(objeto);
	}

	@Override
	public Cliente consultarUsuario(String email) {
		// TODO Auto-generated method stub
		return c.consultarUsuario(email);
	}
}