package fr.treeptik.tpcentreformation.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.treeptik.tpcentreformation.DAO.GenericDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;

public class GenericDAOImpl<T, PK> implements GenericDAO<T, PK> {

	@PersistenceContext
	protected EntityManager entityManager;

	private Class<T> type;

	public GenericDAOImpl(Class<T> type) {

		this.type = type;

	}

	public T save(T entite) throws DAOException {

		entityManager.persist(entite);
		
		return entite;
	}

	public void remove(T entite) throws DAOException {
		
		entityManager.remove(entite);

	}

	public T findById(PK id) throws DAOException {

		return entityManager.find(type, id);
	}

	public List<T> findAll() throws DAOException {

		return entityManager.createQuery("SELECT o FROM " + type.getSimpleName() + " o ", type).getResultList();
	}

}
