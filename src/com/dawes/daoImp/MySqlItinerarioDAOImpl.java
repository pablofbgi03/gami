package com.dawes.daoImp;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.dawes.dao.ItinerarioDAO;
import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;

public class MySqlItinerarioDAOImpl extends GenericDAOImpl<Itinerario, Integer> implements ItinerarioDAO {

	public MySqlItinerarioDAOImpl(SessionFactory sf) {
		super(sf);
	}

	@Override
	public List<Parada> buscarParadas(Itinerario itinerario) {
		List<Parada> paradas = null;
		try {
			// Inicimamos la transaccion
			sf.getCurrentSession().beginTransaction();
			// Seleccionamos las paradas en funcion del itinerario
			System.out.println("dentro de consulta "+itinerario.getIditinerario());
			Query consulta = sf.getCurrentSession()
					.createQuery("FROM Parada where itinerario_iditinerario=:iditinerario");
			
			consulta.setParameter("iditinerario", itinerario.getIditinerario());
			paradas = consulta.getResultList();
			// Guardamos el resultado
			sf.getCurrentSession().getTransaction().commit();
			return paradas;
		} catch (RuntimeException e) {
			sf.getCurrentSession().getTransaction().rollback();
			return null;
		}
	}

}
