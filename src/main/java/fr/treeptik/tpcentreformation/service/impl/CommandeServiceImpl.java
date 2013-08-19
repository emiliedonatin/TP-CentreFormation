package fr.treeptik.tpcentreformation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.treeptik.tpcentreformation.dao.CommandeDAO;
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
