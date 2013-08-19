package fr.treeptik.tpcentreformation.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.tpcentreformation.dao.CommandeDAO;
import fr.treeptik.tpcentreformation.exception.DAOException;
import fr.treeptik.tpcentreformation.model.Commande;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class CommandeTest {
	
	@Autowired
	private CommandeDAO commandeDAO;
	
	@Test
	public void testFindAll(){
		
		try {
			List<Commande> commandes = commandeDAO.findAll();
			
			for (Commande commande : commandes) {
				System.out.println("Numéro de la commande " + commande.getNumeroCommande());
				System.out.println("Date de la commande " + commande.getDateCommande());
				System.out.println("Nombre de places commandées " + commande.getNbrPlacesCommandees());
				System.out.println("Facture associée " + commande.getFacture());
			}
		} catch (DAOException e) {
			Assert.fail(e.getMessage());
		}
	}

}
