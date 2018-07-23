package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.VotoDAO;
import com.dawes.modelo.Voto;

public class MySqlVotoDAOImp extends GenericDAOImpl<Voto, Integer> implements VotoDAO {

	public MySqlVotoDAOImp(SessionFactory sf) {
		super(sf);
	}

	
	
}
