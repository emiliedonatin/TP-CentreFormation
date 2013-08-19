package fr.treeptik.tpcentreformation.DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Societe;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class SocieteTest {
	
	@Autowired
	private SocieteDAO societeDAO;
	
	@Test
	public void testFindAll(){
		
		try {
			List<Societe> societes = societeDAO.findAll();
			
			for (Societe societe : societes) {
				System.out.println("Nom de la société " + societe.getNomSociete());
				System.out.println("Code de la société " + societe.getCodeSociete());
			}
			
		} catch (DAOException e) {
			Assert.fail(e.getMessage());
		}
		
		
	}

}
