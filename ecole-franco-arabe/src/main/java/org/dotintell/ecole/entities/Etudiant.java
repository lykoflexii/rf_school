package org.dotintell.ecole.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Etudiant implements Serializable {
	@Id
	@GeneratedValue
	private Long numero;
	private String nom;
	private String prenom;
	private String nomDuPere;
	private String nomDeLaMere;
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	private String lieuDeNaissance;
	private String telephone;
	private String adresse;
	@ManyToOne
	@JoinColumn(name="CODE_ETUDIANT")
	private Classe classe;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, String nomDuPere, String nomDeLaMere, Date dateDeNaissance,
			String lieuDeNaissance, String telephone, String adresse, Classe classe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nomDuPere = nomDuPere;
		this.nomDeLaMere = nomDeLaMere;
		this.dateDeNaissance = dateDeNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.telephone = telephone;
		this.adresse = adresse;
		this.classe = classe;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNomDuPere() {
		return nomDuPere;
	}

	public void setNomDuPere(String nomDuPere) {
		this.nomDuPere = nomDuPere;
	}

	public String getNomDeLaMere() {
		return nomDeLaMere;
	}

	public void setNomDeLaMere(String nomDeLaMere) {
		this.nomDeLaMere = nomDeLaMere;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}

	public void setLieuDeNaissance(String lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
