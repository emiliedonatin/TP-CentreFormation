package fr.treeptik.tpcentreformation.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.treeptik.tpcentreformation.DAO.FactureDAO;
import fr.treeptik.tpcentreformation.model.Facture;
import fr.treeptik.tpcentreformation.service.FactureService;

public class FactureServiceImpl extends GenericServiceImpl<Facture, Integer, FactureDAO> implements FactureService {

	@Autowired
	private FactureDAO factureDAO;
	
	@Override
	protected FactureDAO getDao() {
		
		return factureDAO;
	}

}
