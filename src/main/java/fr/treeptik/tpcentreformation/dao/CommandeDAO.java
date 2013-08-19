package fr.treeptik.tpcentreformation.dao;

import java.util.List;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Commande;

public interface CommandeDAO extends GenericDAO<Commande, Integer> {
	
	List<Commande> findbyNomSociete(String nomSociete) throws DAOException;
	

}
