package com.dawes.daoImp;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.dawes.dao.ParadaDAO;
import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.modelo.PruebaCultural;
import com.dawes.modelo.PruebaDeportiva;

public class MySqlParadaDAOImpl extends GenericDAOImpl<Parada, Integer> implements ParadaDAO {

	public MySqlParadaDAOImpl(SessionFactory sf) {
		super(sf);
	}

	@Override
	public List<PruebaDeportiva> buscarPruebasdeportivas(Parada parada) {
		List<PruebaDeportiva> pruebasdeportivas = null;
		try {
			// Inicimamos la transaccion
			sf.getCurrentSession().beginTransaction();
			// Seleccionamos las pruebas en funcion de la parada
			Query consulta = sf.getCurrentSession()
					.createQuery("FROM PruebaDeportiva where parada_idparada=:parada_idparada");
			consulta.setParameter("parada_idparada", parada.getIdparada());
			pruebasdeportivas = consulta.getResultList();
			// Guardamos el resultado
			sf.getCurrentSession().getTransaction().commit();
			return pruebasdeportivas;
		} catch (RuntimeException e) {
			sf.getCurrentSession().getTransaction().rollback();
			return null;
		}
	}

	@Override
	public List<PruebaCultural> buscarPruebasculturales(Parada parada) {
		List<PruebaCultural> pruebasculturales = null;
		try {
			// Inicimamos la transaccion
			sf.getCurrentSession().beginTransaction();
			// Seleccionamos las pruebas en funcion de la parada
			Query consulta = sf.getCurrentSession()
					.createQuery("FROM PruebaCultural where parada_idparada=:parada_idparada");
			consulta.setParameter("parada_idparada", parada.getIdparada());
			pruebasculturales = consulta.getResultList();
			// Guardamos el resultado
			sf.getCurrentSession().getTransaction().commit();
			return pruebasculturales;
		} catch (RuntimeException e) {
			sf.getCurrentSession().getTransaction().rollback();
			return null;
		}
	}

}
