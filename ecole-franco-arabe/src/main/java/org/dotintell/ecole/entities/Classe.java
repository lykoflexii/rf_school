package org.dotintell.ecole.entities;

import java.io.Serializable;

public class Classe implements Serializable {
	private String nom;

	public Classe() {
		super();
	}

	public Classe(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
