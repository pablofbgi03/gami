package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.ComentarioDAO;

import com.dawes.modelo.Comentario;

public class MySqlComentarioDAOImpl extends GenericDAOImpl<Comentario, Integer> implements ComentarioDAO {

	public MySqlComentarioDAOImpl(SessionFactory sf) {
		super(sf);
	}
}