package com.dawes.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory sessionFactory;

	public static synchronized SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void cerrarSesion() {
		if (sessionFactory == null)
			sessionFactory.close();
	}
}
