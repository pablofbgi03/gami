package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.ActividadDAO;
import com.dawes.modelo.Actividad;

public class MySqlActividadDAOImp extends GenericDAOImpl<Actividad, Integer> implements ActividadDAO {

	public MySqlActividadDAOImp(SessionFactory sf) {
		super(sf);
	}
}
