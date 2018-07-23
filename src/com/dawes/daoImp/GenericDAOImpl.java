package com.dawes.daoImp;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.dawes.util.GenericDAO;

public abstract class GenericDAOImpl<T, Id extends Serializable> implements GenericDAO<T, Id> {

	SessionFactory sf;
	private Class<T> claseDePersistencia;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl(SessionFactory sf) {
		this.sf = sf;
		this.claseDePersistencia = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.claseDePersistencia = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	public T buscarPorId(Id id) {

		T objeto = null;

		try {
			sf.getCurrentSession().beginTransaction();
			objeto = (T) sf.getCurrentSession().load(claseDePersistencia, id);
			sf.getCurrentSession().getTransaction().commit();
			return objeto;
		} catch (RuntimeException e) {
			sf.getCurrentSession().getTransaction().rollback();
			return null;
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<T> buscarTodo() {
		List<T> objetos = null;
		try {
			sf.getCurrentSession().beginTransaction();

			Query consulta = sf.getCurrentSession()
					.createQuery("select o from " + claseDePersistencia.getSimpleName() + " o");
			objetos = ((org.hibernate.query.Query) consulta).list();
			sf.getCurrentSession().getTransaction().rollback();

		} catch (RuntimeException e) {
			sf.getCurrentSession().getTransaction().rollback();
			return null;
		}
		return objetos;
	}

	public void insertar(T objeto) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(sf.getCurrentSession().merge(objeto));
			sf.getCurrentSession().getTransaction().commit();
			System.out.println("Insertado correctamente");
		} catch (RuntimeException e) {
			System.out.println("Error al insertar " + e.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	public void borrar(T objeto) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(sf.getCurrentSession().merge(objeto));
			sf.getCurrentSession().getTransaction().commit();
			System.out.println("Borrado");
		} catch (RuntimeException e) {
			System.out.println("Error al borrar " + e.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	public void actualizar(T objeto) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().update(sf.getCurrentSession().merge(objeto));
			sf.getCurrentSession().getTransaction().commit();
			System.out.println("Actualizado correctamente");
		} catch (RuntimeException e) {
			System.out.println("Error al actualizar" + e.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	public void guardar(T objeto) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().merge(objeto);
			sf.getCurrentSession().getTransaction().commit();
			System.out.println("Actualizado correctamente");
		} catch (RuntimeException e) {
			System.out.println("Error al actualizar" + e.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}
}
