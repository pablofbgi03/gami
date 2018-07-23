package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.RolDAO;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;

public class MySqlRolDAOImpl extends GenericDAOImpl<Rol, Integer> implements RolDAO {

	public MySqlRolDAOImpl(SessionFactory sf) {
		super(sf);
	}

	public void borrar(Rol objeto) {
		try {
			sf.getCurrentSession().beginTransaction();
			for (Cliente c : objeto.getClientes()) {
				sf.getCurrentSession().delete(c);
			}
			sf.getCurrentSession().delete(objeto);
			sf.getCurrentSession().getTransaction().commit();
			System.out.println("Borrado");
		} catch (RuntimeException e) {
			System.out.println("Error al borrar " + e.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}
}