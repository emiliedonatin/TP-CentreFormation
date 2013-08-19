package fr.treeptik.tpcentreformation.DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Sessions;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class SessionsTest {
	
	@Autowired
	private SessionsDAO sessionsDAO;
	
	@Test
	public void testFindAll(){
		
		try {
			List<Sessions> listSessions = sessionsDAO.findAll();
			
			for (Sessions sessions : listSessions) {
				System.out.println("Numéro de la session " + sessions.getNumeroSession());
				System.out.println("Date de la session " + sessions.getDateSession());
			}
			
		} catch (DAOException e) {
			Assert.fail(e.getMessage());
		}
	}

}
