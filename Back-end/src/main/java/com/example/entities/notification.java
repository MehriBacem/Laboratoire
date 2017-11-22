package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class notification {
	public notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	private String titre ;
	private String description ;
	private String date ;
	@ManyToOne
	@JoinColumn(name="ID_PROJET")
private projet projet ;
	private String temps ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTemps() {
		return temps;
	}
	public void setTemps(String temps) {
		this.temps = temps;
	}
	
	public projet getProjet() {
		return projet;
	}
	public void setProjet(projet projet) {
		this.projet = projet;
	}
	public notification(long id, String titre, String description, String date, com.example.entities.projet projet,
			String temps) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.date = date;
		this.projet = projet;
		this.temps = temps;
	}


}
