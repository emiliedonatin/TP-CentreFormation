package fr.treeptik.tpcentreformation.DAO;

import java.util.List;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Societe;

public interface SocieteDAO extends GenericDAO<Societe, Integer>{

	List<Societe> findAllBySessions() throws DAOException;
	List<Societe> findByNumeroCommande(Integer numeroCommande) throws DAOException;
}
