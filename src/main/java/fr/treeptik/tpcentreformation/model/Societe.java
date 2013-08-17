package fr.treeptik.tpcentreformation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	@Entity
	@Table(name = "SOCIETE")
	public class Societe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CodeSociete")
	private Integer codeSociete;

	@Column(name = "NomSociete")
	private String nomSociete;

	@OneToMany(mappedBy = "societe")
	private List<Commande> commandes;
	
	public Societe() {
		// TODO Auto-generated constructor stub
	}

	public Societe(Integer codeSociete, String nomSociete, List<Commande> commandes) {
		super();
		this.codeSociete = codeSociete;
		this.nomSociete = nomSociete;
		this.commandes = commandes;
	}

	public Integer getCodeSociete() {
		return codeSociete;
	}

	public void setCodeSociete(Integer codeSociete) {
		this.codeSociete = codeSociete;
	}

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	

	@Override
	public String toString() {
		return "Societe [codeSociete=" + codeSociete + ", nomSociete=" + nomSociete + ", commandes=" + commandes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeSociete == null) ? 0 : codeSociete.hashCode());
		result = prime * result + ((commandes == null) ? 0 : commandes.hashCode());
		result = prime * result + ((nomSociete == null) ? 0 : nomSociete.toUpperCase().hashCode());
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
		Societe other = (Societe) obj;
		if (codeSociete == null) {
			if (other.codeSociete != null)
				return false;
		} else if (!codeSociete.equals(other.codeSociete))
			return false;
		if (commandes == null) {
			if (other.commandes != null)
				return false;
		} else if (!commandes.equals(other.commandes))
			return false;
		if (nomSociete == null) {
			if (other.nomSociete != null)
				return false;
		} else if (!nomSociete.equalsIgnoreCase(other.nomSociete))
			return false;
		return true;
	}

	

	}


