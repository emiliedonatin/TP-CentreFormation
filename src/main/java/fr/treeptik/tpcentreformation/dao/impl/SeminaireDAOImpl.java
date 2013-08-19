package fr.treeptik.tpcentreformation.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.treeptik.tpcentreformation.dao.SeminaireDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Seminaire;

@Repository
public class SeminaireDAOImpl extends GenericDAOImpl<Seminaire, Integer> implements SeminaireDAO{

	public SeminaireDAOImpl() {
		super(Seminaire.class);
		
	}

	public List<Seminaire> findByPrixMax() throws DAOException {
		
		TypedQuery<Seminaire> typedQuery = entityManager.createQuery("SELECT s from Seminaire s ORDER BY s.prixSeminaire", Seminaire.class);
		List<Seminaire> resultList = typedQuery.getResultList();
		
		return resultList;
	}

}
