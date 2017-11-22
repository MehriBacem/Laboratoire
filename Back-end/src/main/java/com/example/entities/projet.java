package com.example.entities;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class projet implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long  id ;
	private String titre ;
	private String theme ;
	private String problematique ;

	private String[] mots_cles ;
	@ManyToMany(mappedBy="projets_participes")
	private List<membre> membres ;
	@ManyToOne
	@JoinColumn(name="ID_CHEF")
	private   membre chef_projet ;
	@OneToMany(mappedBy="projet")
	private List<article> ressources_partages;
	@OneToMany(mappedBy="projet")
	private List<notification> notifications ;
	public projet() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getProblematique() {
		return problematique;
	}
	public void setProblematique(String problematique) {
		this.problematique = problematique;
	}
	public String[] getMots_cles() {
		return mots_cles;
	}
	public void setMots_cles(String[] mots_cles) {
		this.mots_cles = mots_cles;
	}
	@JsonIgnore
	@XmlTransient
	public List<membre> getMembres() {
		return membres;
	}
	public void setMembres(List<membre> membres) {
		this.membres = membres;
	}
	public membre getChef_projet() {
		return chef_projet;
	}
	public void setChef_projet(membre chef_projet) {
		this.chef_projet = chef_projet;
	}
	@JsonIgnore
	@XmlTransient
	public List<article> getRessources_partages() {
		return ressources_partages;
	}
	public void setRessources_partages(List<article> ressources_partages) {
		this.ressources_partages = ressources_partages;
	}
	@JsonIgnore
	@XmlTransient
	public List<notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<notification> notifications) {
		this.notifications = notifications;
	}
	public projet(long id, String titre, String theme, String problematique, String[] mots_cles, List<membre> membres,
			membre chef_projet, List<article> ressources_partages, List<notification> notifications) {
		super();
		this.id = id;
		this.titre = titre;
		this.theme = theme;
		this.problematique = problematique;
		this.mots_cles = mots_cles;
		this.membres = membres;
		this.chef_projet = chef_projet;
		this.ressources_partages = ressources_partages;
		this.notifications = notifications;
	}

	
}
