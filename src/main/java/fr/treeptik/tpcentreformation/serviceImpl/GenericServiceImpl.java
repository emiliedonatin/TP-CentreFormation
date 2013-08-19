package fr.treeptik.tpcentreformation.serviceImpl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.tpcentreformation.DAO.GenericDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.exception.ServiceException;
import fr.treeptik.tpcentreformation.service.GenericService;

public abstract class GenericServiceImpl<T, PK, D extends GenericDAO<T, PK>> implements GenericService<T, PK> {

	protected abstract D getDao();

	//@Override
	@Transactional
	public T save(T entite) throws ServiceException {
		try {
			entite = getDao().save(entite);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
		return entite;
	}

	//@Override
	@Transactional
	public void remove(T entite) throws ServiceException {
		try {
			getDao().remove(entite);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

	//@Override
	@Transactional
	public T findById(PK id) throws ServiceException {
		try {
			return getDao().findById(id);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

	//@Override
	@Transactional
	public List<T> findAll() throws ServiceException {
		try {
			return getDao().findAll();
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}
}
