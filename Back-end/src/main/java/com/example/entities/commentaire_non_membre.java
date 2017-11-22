package com.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CNM")
public class commentaire_non_membre extends commentaire {
	
	private String email_proprietaire ;
	private String  nom_proprietaire ;
	public String getEmail_proprietaire() {
		return email_proprietaire;
	}
	public void setEmail_proprietaire(String email_proprietaire) {
		this.email_proprietaire = email_proprietaire;
	}
	public String getNom_proprietaire() {
		return nom_proprietaire;
	}
	public void setNom_proprietaire(String nom_proprietaire) {
		this.nom_proprietaire = nom_proprietaire;
	}
	public commentaire_non_membre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public commentaire_non_membre(String email_proprietaire, String nom_proprietaire) {
		super();
		this.email_proprietaire = email_proprietaire;
		this.nom_proprietaire = nom_proprietaire;
	}
	

}
