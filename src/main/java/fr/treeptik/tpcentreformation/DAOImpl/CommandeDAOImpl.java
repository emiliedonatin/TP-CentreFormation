package fr.treeptik.tpcentreformation.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.treeptik.tpcentreformation.DAO.CommandeDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Commande;

@Repository
public class CommandeDAOImpl extends GenericDAOImpl<Commande, Integer> implements CommandeDAO {

	public CommandeDAOImpl(Class<Commande> type) {
		super(type);
		
	}

	public List<Commande> findbyNomSociete(String nom) throws DAOException {
		
		entityManager.createQuery("Select c from Commande c Right Join Fetch c.  ")
		
		return null;
	}

}
