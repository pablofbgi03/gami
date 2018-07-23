package com.dawes.daoImp;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.dawes.dao.PruebadeportivaDAO;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.PruebaDeportiva;

public class MySqlPruebadeportivaDAOImpl extends GenericDAOImpl<PruebaDeportiva, Integer>
		implements PruebadeportivaDAO {

	public MySqlPruebadeportivaDAOImpl(SessionFactory sf) {
		super(sf);
	}

	@Override
	public List<Multimedia> buscarMultimedias(PruebaDeportiva pruebaDeportiva) {
		List<Multimedia> multimedia = null;
		try {
			// Inicimamos la transaccion
			sf.getCurrentSession().beginTransaction();
			// Seleccionamos las paradas en funcion del itinerario
			
			Query consulta = sf.getCurrentSession()
					.createQuery("FROM Multimedia where pruebaDeportiva_idpruebadeportiva=:idpruebadeportiva");
			
			consulta.setParameter("idpruebadeportiva", pruebaDeportiva.getIdpruebadeportiva());
			multimedia = consulta.getResultList();
			// Guardamos el resultado
			sf.getCurrentSession().getTransaction().commit();
			return multimedia;
		} catch (RuntimeException e) {
			sf.getCurrentSession().getTransaction().rollback();
			return null;
		}
	}

}