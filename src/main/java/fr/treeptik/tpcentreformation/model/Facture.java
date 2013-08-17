package fr.treeptik.tpcentreformation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FACTURE")
public class Facture implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NumeroFacture")
	private Integer numeroFacture;

	@Column(name = "DateFacture")
	@Temporal(TemporalType.DATE)
	private Date dateFacture;

	@Column(name = "MontantFacture")
	private Integer montantFacture;

	@Column(name = "NbrPlacesFacturees")
	private Integer nbrPlacesFacturees;
	
	@OneToOne(mappedBy= "NumeroCommande")
	private Commande commande;

	
	public Facture() {
		
	}


	public Facture(Integer numeroFacture, Date dateFacture, Integer montantFacture, Integer nbrPlacesFacturees, Commande commande) {
		super();
		this.numeroFacture = numeroFacture;
		this.dateFacture = dateFacture;
		this.montantFacture = montantFacture;
		this.nbrPlacesFacturees = nbrPlacesFacturees;
		this.commande = commande;
	}


	public Integer getNumeroFacture() {
		return numeroFacture;
	}


	public void setNumeroFacture(Integer numeroFacture) {
		this.numeroFacture = numeroFacture;
	}


	public Date getDateFacture() {
		return dateFacture;
	}


	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}


	public Integer getMontantFacture() {
		return montantFacture;
	}


	public void setMontantFacture(Integer montantFacture) {
		this.montantFacture = montantFacture;
	}


	public Integer getNbrPlacesFacturees() {
		return nbrPlacesFacturees;
	}


	public void setNbrPlacesFacturees(Integer nbrPlacesFacturees) {
		this.nbrPlacesFacturees = nbrPlacesFacturees;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	@Override
	public String toString() {
		return "Facture [numeroFacture=" + numeroFacture + ", dateFacture=" + dateFacture + ", montantFacture=" + montantFacture + ", nbrPlacesFacturees=" + nbrPlacesFacturees + ", commande=" + commande + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commande == null) ? 0 : commande.hashCode());
		result = prime * result + ((dateFacture == null) ? 0 : dateFacture.hashCode());
		result = prime * result + ((montantFacture == null) ? 0 : montantFacture.hashCode());
		result = prime * result + ((nbrPlacesFacturees == null) ? 0 : nbrPlacesFacturees.hashCode());
		result = prime * result + ((numeroFacture == null) ? 0 : numeroFacture.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Facture other = (Facture) obj;
		if (commande == null) {
			if (other.commande != null)
				return false;
		} else if (!commande.equals(other.commande))
			return false;
		if (dateFacture == null) {
			if (other.dateFacture != null)
				return false;
		} else if (!dateFacture.equals(other.dateFacture))
			return false;
		if (montantFacture == null) {
			if (other.montantFacture != null)
				return false;
		} else if (!montantFacture.equals(other.montantFacture))
			return false;
		if (nbrPlacesFacturees == null) {
			if (other.nbrPlacesFacturees != null)
				return false;
		} else if (!nbrPlacesFacturees.equals(other.nbrPlacesFacturees))
			return false;
		if (numeroFacture == null) {
			if (other.numeroFacture != null)
				return false;
		} else if (!numeroFacture.equals(other.numeroFacture))
			return false;
		return true;
	}
	
	
	

}
