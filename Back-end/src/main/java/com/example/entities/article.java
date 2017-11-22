package com.example.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.web.multipart.MultipartFile;
@Entity
@DiscriminatorValue(value="ART")
public class article  extends reference {

private String titre ;
@ManyToOne
@JoinColumn(name="ID_MEMBRE")
private membre membre ;
private String date ;
private String contenue ;
private String  temps ;
@ManyToOne
@JoinColumn(name="ID_PROJET")
private projet projet ;

private long nombre_aimes ;
private String   fichier_attache ;
private String parametres_partage ;
public article(  String titre, membre membre, String date, String contenue, String temps,
		 long nombre_aimes,String  fichier_attache,
		String parametres_partage) {
	super();
	
	this.titre = titre;
	this.membre = membre;
	this.date = date;
	this.contenue = contenue;
	this.temps = temps;

	this.nombre_aimes = nombre_aimes;
	this.fichier_attache = fichier_attache;
	this.parametres_partage = parametres_partage;
}

public String getTemps() {
	return temps;
}
public void setTemps(String temps) {
	this.temps = temps;
}
public String getParametres_partage() {
	return parametres_partage;
}
public void setParametres_partage(String parametres_partage) {
	this.parametres_partage = parametres_partage;
}
public String getContenue() {
	return contenue;
}



public article(String titre, membre utilisateur, String date, String contenu, long nombre_aimes,
		String parametres_partages) {
	super();
	this.titre = titre;
	this.membre = utilisateur;
	this.date = date;
	this.contenue = contenu;
	this.nombre_aimes = nombre_aimes;
	
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public membre  getMembre() {
	return membre;
}
public void setMembre(membre  membre) {
	this.membre = membre;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getContenu() {
	return contenue;
}
public void setContenue(String contenu) {
	this.contenue = contenu;
}

public long getNombre_aimes() {
	return nombre_aimes;
}
public void setNombre_aimes(long nombre_aimes) {
	this.nombre_aimes = nombre_aimes;
}
public String getFichiers_attaches() {
	return fichier_attache;
}
public void setFichiers_attaches(String fichiers_attache) {
	this.fichier_attache = fichiers_attache;
}

public article() {
	super();
	// TODO Auto-generated constructor stub
}


}
