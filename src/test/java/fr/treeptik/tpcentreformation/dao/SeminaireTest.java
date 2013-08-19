package fr.treeptik.tpcentreformation.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.tpcentreformation.dao.SeminaireDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Seminaire;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class SeminaireTest {

	@Autowired
	private SeminaireDAO seminaireDAO;
	
	@Test
	public void testFindAll(){
		
		try {
			List<Seminaire> seminaires = seminaireDAO.findAll();
			
			for (Seminaire seminaire : seminaires) {
				System.out.println("Code du séminaire " + seminaire.getCodeSeminaire());
				System.out.println("Nombre de places disponibles " + seminaire.getNbPlacesSeminaire());
			}
			
		} catch (DAOException e) {
			Assert.fail(e.getMessage());
		}
		
	}
	
}
