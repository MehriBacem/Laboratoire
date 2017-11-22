package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class nouveaute {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	private String titre ;
	private String contenue;
	private String date ;
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
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public nouveaute(long id, String titre, String contenue, String date) {
		super();
		this.id = id;
		this.titre = titre;
		this.contenue = contenue;
		this.date = date;
	}
	public nouveaute() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
