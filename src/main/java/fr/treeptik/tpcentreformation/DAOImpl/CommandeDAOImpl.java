package fr.treeptik.tpcentreformation.DAOImpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.treeptik.tpcentreformation.DAO.CommandeDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Commande;

@Repository
public class CommandeDAOImpl extends GenericDAOImpl<Commande, Integer> implements CommandeDAO {

	public CommandeDAOImpl() {
		super(Commande.class);
		
	}

	public List<Commande> findbyNomSociete(String nomSociete) throws DAOException {
		
		TypedQuery<Commande> query = entityManager.createNamedQuery("Select c From Commande c join FETC c.societe s Where s.name= :name", Commande.class);
		query.setParameter("name", nomSociete);
		List<Commande> resultlist = query.getResultList();
		
		return resultlist;
	}

	

}
