package com.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value="CM")
public class commentaire_membre extends commentaire {
	@ManyToOne
	@JoinColumn(name="ID_MEMBRE")
	private membre membre ;

	public commentaire_membre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public commentaire_membre(reference reference, String date, String temps, String contenu) {
		super(reference, date, temps, contenu);
		// TODO Auto-generated constructor stub
	}

	public commentaire_membre(membre membre) {
		super();
		this.membre = membre;
	}
	

}
