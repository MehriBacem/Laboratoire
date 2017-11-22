package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="FOR")
public class forum extends reference {
	private String titre;
	private String date ;
	private String temps ;
	
	private String[] mots_cles;
	private  String subject ;
	private long nb_votes ;
	private long nb_answers;
	private String creator_email ;
	public forum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public forum(String titre, String date, String temps,String[] mots_cles, String subject, long nb_votes,
			long nb_answers, String creator_email ) {
		super();
		this.titre = titre;
		this.date = date;
		this.temps = temps;
		this.mots_cles = mots_cles;
		this.subject = subject;
		this.nb_votes = nb_votes;
		this.nb_answers = nb_answers;
		this.creator_email = creator_email;
		
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
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
	public  String[] getMots_cles() {
		return mots_cles;
	}
	public void setMots_cles(String[] mots_cles) {
		this.mots_cles = mots_cles;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getNb_votes() {
		return nb_votes;
	}
	public void setNb_votes(long nb_votes) {
		this.nb_votes = nb_votes;
	}
	public long getNb_answers() {
		return nb_answers;
	}
	public void setNb_answers(long nb_answers) {
		this.nb_answers = nb_answers;
	}
	public String getCreator_email() {
		return creator_email;
	}
	public void setCreator_email(String creator_email) {
		this.creator_email = creator_email;
	}
	

}
