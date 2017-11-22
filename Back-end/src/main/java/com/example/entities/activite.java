package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class activite  implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	private  String titre ;
	private  long anne ;
	@ManyToOne
	@JoinColumn(name="ID_Membre")
	private  membre membre ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public activite(long id ,String titre, long anne, com.example.entities.membre membre) {
		super();
		this.id=id ;
		this.titre = titre;
		this.anne = anne;
		this.membre = membre;
	}
	public membre getMembre() {
		return membre;
	}
	public void setMembre(membre membre) {
		this.membre = membre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public long getAnne() {
		return anne;
	}
	public void setAnne(long anne) {
		this.anne = anne;
	}
	public activite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public activite(String titre, long anne) {
		super();
		this.titre = titre;
		this.anne = anne;
	}
	
}
