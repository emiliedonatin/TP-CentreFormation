package fr.treeptik.tpcentreformation.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.treeptik.tpcentreformation.DAO.SessionsDAO;
import fr.treeptik.tpcentreformation.model.Sessions;
import fr.treeptik.tpcentreformation.service.SessionsService;

public class SessionsServiceImpl extends GenericServiceImpl<Sessions, Integer, SessionsDAO> implements SessionsService {

	@Autowired
	private SessionsDAO sessionsDAO;
	
	
	@Override
	protected SessionsDAO getDao() {
		
		return sessionsDAO;
	}

}
