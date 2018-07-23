package com.dawes.daoImp;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.dawes.dao.ClienteDAO;
import com.dawes.modelo.Cliente;

public class MySqlClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO {

	public MySqlClienteDAOImpl(SessionFactory sf) {
		super(sf);
	}

	@Override
	public Cliente consultarUsuario(String email) {
		try {
			sf.getCurrentSession().beginTransaction();
			System.out.println("begin hecho");
			Query q = sf.getCurrentSession().createQuery("FROM  Cliente where email=:email");
			q.setParameter("email", email);
			System.out.println("query hecho");
			Cliente c = (Cliente) q.getSingleResult();
			sf.getCurrentSession().getTransaction().commit();
			return c;
		} catch (RuntimeException e) {
			System.out.println("error al consultar Cliente " + e.getMessage());
		}
		return null;
	}
}
