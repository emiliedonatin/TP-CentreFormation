package fr.treeptik.tpcentreformation.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.treeptik.tpcentreformation.DAO.SeminaireDAO;
import fr.treeptik.tpcentreformation.model.Seminaire;
import fr.treeptik.tpcentreformation.service.SeminaireService;

public class SeminaireServiceImpl extends GenericServiceImpl<Seminaire, Integer, SeminaireDAO> implements SeminaireService {

	@Autowired
	private SeminaireDAO seminaireDAO;
	
	@Override
	protected SeminaireDAO getDao() {
		
		return seminaireDAO;
	}

}
