package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.PremioDAO;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Premio;

public class MySqlPremioDAOImpl extends GenericDAOImpl<Premio, Integer> implements PremioDAO {

	public MySqlPremioDAOImpl(SessionFactory sf) {
		super(sf);
	}
	/*
	 * @Override public void insertar(Premio objeto) { try {
	 * sf.getCurrentSession().beginTransaction(); Cliente c=
	 * objeto.getCliente();
	 * c.setPuntosacumulados(c.getPuntosacumulados()+objeto.getPuntos());
	 * sf.getCurrentSession().merge(c); sf.getCurrentSession().save(objeto);
	 * sf.getCurrentSession().getTransaction().commit();
	 * System.out.println("Insertado"); }catch (RuntimeException e){
	 * System.out.println("Error al insertar "+e.getMessage());
	 * sf.getCurrentSession().getTransaction().rollback(); } }
	 * 
	 */

}
