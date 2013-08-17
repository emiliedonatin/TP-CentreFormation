package fr.treeptik.tpcentreformation.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COMMANDE")
public class Commande implements Serializable {

private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "NumeroCommande")
private Integer numeroCommande;

@Column(name = "DateCommande")
@Temporal(TemporalType.DATE)
private Date dateCommande;

@Column(name = "NbrPlacesCommandees")
private Integer nbrPlacesCommandees;

@OneToOne
@JoinColumn(name = "NumeroFacture")
private Facture facture;

@ManyToOne
@JoinColumn(name = "NumeroSociete")
private Societe societe;

@OneToMany(mappedBy= "commande")
private List<Sessions> listSessions;

public Commande() {
	
}

public Commande(Integer numeroCommande, Date dateCommande, Integer nbrPlacesCommandees, Facture facture, Societe societe, List<Sessions> listSessions) {
	super();
	this.numeroCommande = numeroCommande;
	this.dateCommande = dateCommande;
	this.nbrPlacesCommandees = nbrPlacesCommandees;
	this.facture = facture;
	this.societe = societe;
	this.listSessions = listSessions;
}

public Integer getNumeroCommande() {
	return numeroCommande;
}

public void setNumeroCommande(Integer numeroCommande) {
	this.numeroCommande = numeroCommande;
}

public Date getDateCommande() {
	return dateCommande;
}

public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}

public Integer getNbrPlacesCommandees() {
	return nbrPlacesCommandees;
}

public void setNbrPlacesCommandees(Integer nbrPlacesCommandees) {
	this.nbrPlacesCommandees = nbrPlacesCommandees;
}

public Facture getFacture() {
	return facture;
}

public void setFacture(Facture facture) {
	this.facture = facture;
}

public Societe getSociete() {
	return societe;
}

public void setSociete(Societe societe) {
	this.societe = societe;
}

public List<Sessions> getListSessions() {
	return listSessions;
}

public void setListSessions(List<Sessions> listSessions) {
	this.listSessions = listSessions;
}

@Override
public String toString() {
	return "Commande [numeroCommande=" + numeroCommande + ", dateCommande=" + dateCommande + ", nbrPlacesCommandees=" + nbrPlacesCommandees + ", facture=" + facture + ", societe=" + societe + ", listSessions=" + listSessions + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dateCommande == null) ? 0 : dateCommande.hashCode());
	result = prime * result + ((facture == null) ? 0 : facture.hashCode());
	result = prime * result + ((listSessions == null) ? 0 : listSessions.hashCode());
	result = prime * result + ((nbrPlacesCommandees == null) ? 0 : nbrPlacesCommandees.hashCode());
	result = prime * result + ((numeroCommande == null) ? 0 : numeroCommande.hashCode());
	result = prime * result + ((societe == null) ? 0 : societe.hashCode());
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
	Commande other = (Commande) obj;
	if (dateCommande == null) {
		if (other.dateCommande != null)
			return false;
	} else if (!dateCommande.equals(other.dateCommande))
		return false;
	if (facture == null) {
		if (other.facture != null)
			return false;
	} else if (!facture.equals(other.facture))
		return false;
	if (listSessions == null) {
		if (other.listSessions != null)
			return false;
	} else if (!listSessions.equals(other.listSessions))
		return false;
	if (nbrPlacesCommandees == null) {
		if (other.nbrPlacesCommandees != null)
			return false;
	} else if (!nbrPlacesCommandees.equals(other.nbrPlacesCommandees))
		return false;
	if (numeroCommande == null) {
		if (other.numeroCommande != null)
			return false;
	} else if (!numeroCommande.equals(other.numeroCommande))
		return false;
	if (societe == null) {
		if (other.societe != null)
			return false;
	} else if (!societe.equals(other.societe))
		return false;
	return true;
}



}
