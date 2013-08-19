package fr.treeptik.tpcentreformation.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.treeptik.tpcentreformation.DAO.CommandeDAO;
import fr.treeptik.tpcentreformation.model.Commande;
import fr.treeptik.tpcentreformation.service.CommandeService;

public class CommandeServiceImpl extends GenericServiceImpl<Commande, Integer, CommandeDAO> implements CommandeService {

	@Autowired
	private CommandeDAO commandeDAO;
	
	@Override
	protected CommandeDAO getDao() {

		return commandeDAO;
	}

}
