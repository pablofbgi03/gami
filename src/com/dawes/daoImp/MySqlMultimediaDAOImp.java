package com.dawes.daoImp;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.dawes.dao.MultimediaDAO;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;

public class MySqlMultimediaDAOImp extends GenericDAOImpl<Multimedia, Integer> implements MultimediaDAO {

	public MySqlMultimediaDAOImp(SessionFactory sf) {
		super(sf);
	}

	@Override
	public List<Comentario> buscarComentarios(Multimedia multimedia) {
		List<Comentario> comentario = null;
		try {
			// Inicimamos la transaccion
			sf.getCurrentSession().beginTransaction();
			// Seleccionamos las paradas en funcion del itinerario
			
			Query consulta = sf.getCurrentSession()
					.createQuery("FROM Comentario where multimedia_idmultimedia=:idmultimedia");
			
			consulta.setParameter("idmultimedia", multimedia.getIdmultimedia());
			comentario = consulta.getResultList();
			// Guardamos el resultado
			sf.getCurrentSession().getTransaction().commit();
			return comentario;
		} catch (RuntimeException e) {
			sf.getCurrentSession().getTransaction().rollback();
			return null;
		}
	}
}
