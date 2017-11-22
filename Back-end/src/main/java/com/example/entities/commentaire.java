package com.example.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="TYPE_COM",
		discriminatorType = javax.persistence.DiscriminatorType.STRING 
		)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="type")
@JsonSubTypes(
		{
@Type(name="CM",value=commentaire_membre.class),
@Type(name="CNM",value=commentaire_non_membre.class)
		}
		)
public abstract class commentaire implements Serializable{


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@ManyToOne
	@JoinColumn(name="ID_REF")
	private reference  reference ;
	private String date ; 
	private String temps ;
	private String contenu ;
	
	public commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public reference getReference() {
		return reference;
	}
	public void setReference(reference reference) {
		this.reference = reference;
	}

	public commentaire(reference reference, String date, String temps, String contenu) {
		super();
		this.reference = reference;
		this.date = date;
		this.temps = temps;
		this.contenu = contenu;
	}
	public reference getId_reference() {
		return reference;
	}
	public void setId_reference(reference id_reference) {
		this.reference = id_reference;
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
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
