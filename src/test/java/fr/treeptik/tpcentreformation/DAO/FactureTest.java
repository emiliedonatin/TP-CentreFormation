package fr.treeptik.tpcentreformation.DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Facture;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class FactureTest {
	
	@Autowired
	private FactureDAO factureDAO;
	
	@Test
	public void testFindAll(){
		
		try {
			List<Facture> factures = factureDAO.findAll();
			
			for (Facture facture : factures) {
				System.out.println("Numéro de la facture " + facture.getNumeroFacture());
				System.out.println("Date de la facture " + facture.getDateFacture());
				System.out.println("Nombre de place facturées " + facture.getNbrPlacesFacturees());
			}
			
		} catch (DAOException e) {
			Assert.fail(e.getMessage());
		}
		
	}

}
