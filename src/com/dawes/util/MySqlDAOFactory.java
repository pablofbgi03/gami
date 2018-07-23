package com.dawes.util;

import org.hibernate.SessionFactory;

import com.dawes.dao.ActividadDAO;
import com.dawes.dao.ClienteDAO;
import com.dawes.dao.ComentarioDAO;
import com.dawes.dao.ItinerarioDAO;
import com.dawes.dao.MultimediaDAO;
import com.dawes.dao.NoticiaDAO;
import com.dawes.dao.ParadaDAO;
import com.dawes.dao.PremioDAO;
import com.dawes.dao.PruebaculturalDAO;
import com.dawes.dao.PruebadeportivaDAO;
import com.dawes.dao.RolDAO;
import com.dawes.dao.VotoDAO;
import com.dawes.daoImp.MySqlActividadDAOImp;
import com.dawes.daoImp.MySqlClienteDAOImpl;
import com.dawes.daoImp.MySqlComentarioDAOImpl;
import com.dawes.daoImp.MySqlItinerarioDAOImpl;
import com.dawes.daoImp.MySqlMultimediaDAOImp;
import com.dawes.daoImp.MySqlNoticiaDAOImp;
import com.dawes.daoImp.MySqlParadaDAOImpl;
import com.dawes.daoImp.MySqlPremioDAOImpl;
import com.dawes.daoImp.MySqlPruebaculturalDAOImpl;
import com.dawes.daoImp.MySqlPruebadeportivaDAOImpl;
import com.dawes.daoImp.MySqlRolDAOImpl;
import com.dawes.daoImp.MySqlVotoDAOImp;

public class MySqlDAOFactory {
	private SessionFactory sf;

	public MySqlDAOFactory() {
		try {
			sf = HibernateUtility.getSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public ClienteDAO getClienteDAO() {
		return new MySqlClienteDAOImpl(sf);
	}

	public RolDAO getRolDAO() {
		return new MySqlRolDAOImpl(sf);
	}

	public PremioDAO getPremioDAO() {
		return new MySqlPremioDAOImpl(sf);
	}

	public ComentarioDAO getComentarioDAO() {
		return new MySqlComentarioDAOImpl(sf);
	}

	public NoticiaDAO getNoticiaDAO() {
		return new MySqlNoticiaDAOImp(sf);
	}

	public ActividadDAO getActividadDAO() {
		return new MySqlActividadDAOImp(sf);
	}

	public MultimediaDAO getMultimediaDAO() {
		return new MySqlMultimediaDAOImp(sf);
	}

	public VotoDAO getVotoDAO() {
		return new MySqlVotoDAOImp(sf);
	}

	public ItinerarioDAO getItinerarioDAO() {
		return new MySqlItinerarioDAOImpl(sf);
	}

	public ParadaDAO getParadaDAO() {
		return new MySqlParadaDAOImpl(sf);
	}

	public PruebaculturalDAO getPruebaculturalDAO() {
		return new MySqlPruebaculturalDAOImpl(sf);
	}

	public PruebadeportivaDAO getPruebadeportivaDAO() {
		return new MySqlPruebadeportivaDAOImpl(sf);
	}
}
