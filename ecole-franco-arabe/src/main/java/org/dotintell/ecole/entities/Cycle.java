package org.dotintell.ecole.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cycle implements Serializable {
	@Id
	private String nom;
	private String programme;
	@OneToMany(mappedBy="cycle", fetch=FetchType.LAZY)
	private Collection<Classe> classes;
	@OneToMany(mappedBy="cycle", fetch=FetchType.LAZY)
	private Collection<Professeur> professeurs;
	
	public Cycle() {
		super();
	}

	public Cycle(String nom, String programme) {
		super();
		this.nom = nom;
		this.programme = programme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getProgramme() {
		return programme;
	}

	public Collection<Professeur> getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(Collection<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}
	
	public Collection<Classe> getClasses() {
		return classes;
	}

	public void setClasses(Collection<Classe> classes) {
		this.classes = classes;
	}

}
