package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.NoticiaDAO;
import com.dawes.modelo.Noticia;

public class MySqlNoticiaDAOImp extends GenericDAOImpl<Noticia, Integer> implements NoticiaDAO {

	public MySqlNoticiaDAOImp(SessionFactory sf) {
		super(sf);
	}
}
