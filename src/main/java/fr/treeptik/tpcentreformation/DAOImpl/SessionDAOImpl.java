package fr.treeptik.tpcentreformation.DAOImpl;

import org.springframework.stereotype.Repository;

import fr.treeptik.tpcentreformation.DAO.SessionsDAO;
import fr.treeptik.tpcentreformation.model.Sessions;

@Repository
public class SessionDAOImpl extends GenericDAOImpl<Sessions, Integer> implements SessionsDAO {

	public SessionDAOImpl() {
		super(Sessions.class);
		
	}

}
