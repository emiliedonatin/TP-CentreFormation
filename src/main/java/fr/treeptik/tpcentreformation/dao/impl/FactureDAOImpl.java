package fr.treeptik.tpcentreformation.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.treeptik.tpcentreformation.dao.FactureDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Facture;

@Repository
public class FactureDAOImpl extends GenericDAOImpl<Facture, Integer> implements FactureDAO {

	public FactureDAOImpl() {
		super(Facture.class);
		
	}

	@Override
	public List<Facture> findByNumeroSession(Integer numeroSession) throws DAOException {
		
		TypedQuery<Facture> typedQuery = entityManager.createQuery("SELECT f FROM Facture f JOIN f.commande c JOIN c.sessions s WHERE s.numeroSession= :numero", Facture.class);
		typedQuery.setParameter("numero", numeroSession);
		List<Facture> resultList = typedQuery.getResultList(); 
		
		return resultList;
	}

}
