package fr.treeptik.tpcentreformation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SEMINAIRE")
public class Seminaire implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CodeSeminaire")
	private Integer codeSeminaire;

	@Column(name = "PrixSeminaire")
	private Integer prixSeminaire;

	@Column(name = "DureeSeminaire")
	private Integer dureeSeminaire;

	@Column(name = "NiveauSeminaire")
	private Integer niveauSeminaire;

	@Column(name = "NbPlacesSeminaire")
	private Integer nbPlacesSeminaire;
	
	@ManyToOne
	@JoinColumn(name = "NumeroSession")
	private Sessions sessions;
	
	public Seminaire() {
		// TODO Auto-generated constructor stub
	}

	public Seminaire(Integer codeSeminaire, Integer prixSeminaire, Integer dureeSeminaire, Integer niveauSeminaire, Integer nbPlacesSeminaire, Sessions sessions) {
		super();
		this.codeSeminaire = codeSeminaire;
		this.prixSeminaire = prixSeminaire;
		this.dureeSeminaire = dureeSeminaire;
		this.niveauSeminaire = niveauSeminaire;
		this.nbPlacesSeminaire = nbPlacesSeminaire;
		this.sessions = sessions;
	}

	public Integer getCodeSeminaire() {
		return codeSeminaire;
	}

	public void setCodeSeminaire(Integer codeSeminaire) {
		this.codeSeminaire = codeSeminaire;
	}

	public Integer getPrixSeminaire() {
		return prixSeminaire;
	}

	public void setPrixSeminaire(Integer prixSeminaire) {
		this.prixSeminaire = prixSeminaire;
	}

	public Integer getDureeSeminaire() {
		return dureeSeminaire;
	}

	public void setDureeSeminaire(Integer dureeSeminaire) {
		this.dureeSeminaire = dureeSeminaire;
	}

	public Integer getNiveauSeminaire() {
		return niveauSeminaire;
	}

	public void setNiveauSeminaire(Integer niveauSeminaire) {
		this.niveauSeminaire = niveauSeminaire;
	}

	public Integer getNbPlacesSeminaire() {
		return nbPlacesSeminaire;
	}

	public void setNbPlacesSeminaire(Integer nbPlacesSeminaire) {
		this.nbPlacesSeminaire = nbPlacesSeminaire;
	}

	public Sessions getSessions() {
		return sessions;
	}

	public void setSessions(Sessions sessions) {
		this.sessions = sessions;
	}

	@Override
	public String toString() {
		return "Seminaire [codeSeminaire=" + codeSeminaire + ", prixSeminaire=" + prixSeminaire + ", dureeSeminaire=" + dureeSeminaire + ", niveauSeminaire=" + niveauSeminaire + ", nbPlacesSeminaire=" + nbPlacesSeminaire + ", sessions=" + sessions
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeSeminaire == null) ? 0 : codeSeminaire.hashCode());
		result = prime * result + ((dureeSeminaire == null) ? 0 : dureeSeminaire.hashCode());
		result = prime * result + ((nbPlacesSeminaire == null) ? 0 : nbPlacesSeminaire.hashCode());
		result = prime * result + ((niveauSeminaire == null) ? 0 : niveauSeminaire.hashCode());
		result = prime * result + ((prixSeminaire == null) ? 0 : prixSeminaire.hashCode());
		result = prime * result + ((sessions == null) ? 0 : sessions.hashCode());
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
		Seminaire other = (Seminaire) obj;
		if (codeSeminaire == null) {
			if (other.codeSeminaire != null)
				return false;
		} else if (!codeSeminaire.equals(other.codeSeminaire))
			return false;
		if (dureeSeminaire == null) {
			if (other.dureeSeminaire != null)
				return false;
		} else if (!dureeSeminaire.equals(other.dureeSeminaire))
			return false;
		if (nbPlacesSeminaire == null) {
			if (other.nbPlacesSeminaire != null)
				return false;
		} else if (!nbPlacesSeminaire.equals(other.nbPlacesSeminaire))
			return false;
		if (niveauSeminaire == null) {
			if (other.niveauSeminaire != null)
				return false;
		} else if (!niveauSeminaire.equals(other.niveauSeminaire))
			return false;
		if (prixSeminaire == null) {
			if (other.prixSeminaire != null)
				return false;
		} else if (!prixSeminaire.equals(other.prixSeminaire))
			return false;
		if (sessions == null) {
			if (other.sessions != null)
				return false;
		} else if (!sessions.equals(other.sessions))
			return false;
		return true;
	}
	

	
	
}
