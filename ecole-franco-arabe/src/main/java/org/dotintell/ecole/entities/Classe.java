package org.dotintell.ecole.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable {
	@Id
	private String nom;
	@ManyToOne
	@JoinColumn(name="CODE_CLASSE")
	private Cycle cycle;
	@OneToMany(mappedBy="classe", fetch=FetchType.LAZY)
	private Collection<Etudiant> etudiants;
	
	public Classe() {
		super();
	}

	public Classe(String nom, Cycle cycle) {
		super();
		this.nom = nom;
		this.cycle = cycle;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

}
