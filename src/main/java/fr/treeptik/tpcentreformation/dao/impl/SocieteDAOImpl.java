package fr.treeptik.tpcentreformation.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.treeptik.tpcentreformation.dao.SocieteDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Societe;

@Repository
public class SocieteDAOImpl extends GenericDAOImpl<Societe, Integer> implements SocieteDAO {

	public SocieteDAOImpl() {
		super(Societe.class);
		
	}

	public List<Societe> findAllBySessions() throws DAOException {
		
		return null;
	}

	public List<Societe> findByNumeroCommande(Integer numeroCommande) throws DAOException {
		
		return null;
	}

}
