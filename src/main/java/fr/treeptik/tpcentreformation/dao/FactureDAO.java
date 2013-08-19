package fr.treeptik.tpcentreformation.dao;

import java.util.List;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Facture;

public interface FactureDAO extends GenericDAO<Facture, Integer>{
	
	List<Facture> findByNumeroSession (Integer numeroSession) throws DAOException;

}
