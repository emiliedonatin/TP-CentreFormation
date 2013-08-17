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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SESSIONS")
public class Sessions implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NumeroSession")
	private Integer numeroSession;

	@Column(name = "DateSession")
	@Temporal(TemporalType.DATE)
	private Date dateSession;

	@Column(name = "HeureDebut")
	@Temporal(TemporalType.TIME)
	private Date heureDebut;

	@Column(name = "HeureFin")
	@Temporal(TemporalType.TIME)
	private Date heureFin;
	
	@ManyToOne
	@JoinColumn(name= "NumeroCommande")
	private Commande commande;
	
	@OneToMany(mappedBy= "sessions")
	private List<Seminaire> seminaires;
	
	public Sessions() {
		
	}

	public Sessions(Integer numeroSession, Date dateSession, Date heureDebut, Date heureFin, Commande commande, List<Seminaire> seminaires) {
		super();
		this.numeroSession = numeroSession;
		this.dateSession = dateSession;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.commande = commande;
		this.seminaires = seminaires;
	}

	public Integer getNumeroSession() {
		return numeroSession;
	}

	public void setNumeroSession(Integer numeroSession) {
		this.numeroSession = numeroSession;
	}

	public Date getDateSession() {
		return dateSession;
	}

	public void setDateSession(Date dateSession) {
		this.dateSession = dateSession;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public List<Seminaire> getSeminaires() {
		return seminaires;
	}

	public void setSeminaires(List<Seminaire> seminaires) {
		this.seminaires = seminaires;
	}

	@Override
	public String toString() {
		return "Sessions [numeroSession=" + numeroSession + ", dateSession=" + dateSession + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", commande=" + commande + ", seminaires=" + seminaires + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commande == null) ? 0 : commande.hashCode());
		result = prime * result + ((dateSession == null) ? 0 : dateSession.hashCode());
		result = prime * result + ((heureDebut == null) ? 0 : heureDebut.hashCode());
		result = prime * result + ((heureFin == null) ? 0 : heureFin.hashCode());
		result = prime * result + ((numeroSession == null) ? 0 : numeroSession.hashCode());
		result = prime * result + ((seminaires == null) ? 0 : seminaires.hashCode());
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
		Sessions other = (Sessions) obj;
		if (commande == null) {
			if (other.commande != null)
				return false;
		} else if (!commande.equals(other.commande))
			return false;
		if (dateSession == null) {
			if (other.dateSession != null)
				return false;
		} else if (!dateSession.equals(other.dateSession))
			return false;
		if (heureDebut == null) {
			if (other.heureDebut != null)
				return false;
		} else if (!heureDebut.equals(other.heureDebut))
			return false;
		if (heureFin == null) {
			if (other.heureFin != null)
				return false;
		} else if (!heureFin.equals(other.heureFin))
			return false;
		if (numeroSession == null) {
			if (other.numeroSession != null)
				return false;
		} else if (!numeroSession.equals(other.numeroSession))
			return false;
		if (seminaires == null) {
			if (other.seminaires != null)
				return false;
		} else if (!seminaires.equals(other.seminaires))
			return false;
		return true;
	}
	
	

}
