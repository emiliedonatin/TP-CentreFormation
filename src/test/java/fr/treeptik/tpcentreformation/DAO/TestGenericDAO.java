package fr.treeptik.tpcentreformation.DAO;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Commande;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestGenericDAO {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private CommandeDAO commandeDAO;
	
	
	
	@Test
	@Transactional
	@Rollback(false)
	public void testMapping(){
		
		Commande commande = new Commande(null, new Date(), 2, null, null, null);
		try {
			commande = commandeDAO.save(commande);
			Assert.assertNotNull(commande);
		} catch (DAOException e) {
			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	
	
	}
}
