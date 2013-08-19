package fr.treeptik.tpcentreformation.dao;

import java.util.List;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Seminaire;

public interface SeminaireDAO extends GenericDAO<Seminaire, Integer>{

	
	List<Seminaire> findByPrixMax() throws DAOException;
}
