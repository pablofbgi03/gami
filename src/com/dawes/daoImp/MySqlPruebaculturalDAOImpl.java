package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.PruebaculturalDAO;
import com.dawes.modelo.PruebaCultural;

public class MySqlPruebaculturalDAOImpl extends GenericDAOImpl<PruebaCultural, Integer> implements PruebaculturalDAO {

	public MySqlPruebaculturalDAOImpl(SessionFactory sf) {
		super(sf);
	}

}