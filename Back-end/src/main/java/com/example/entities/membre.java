package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class membre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_membre ;
private String nom_prenom ;
private String date_naissance ;
private String email ;
private boolean isAdmin ;
private String lien_cv ;
private String lien_photo_profil ;
private  String[]  numero_tel ;
private String passwd ;
private String titre ;   //docteur or chercheur 
private String status ;   //single or maried 
private String adresse ;
private String alias ;
private String num_cin ;
@OneToMany(mappedBy="source")
private List<message> messages_envoyes ;
@OneToMany(mappedBy="destination")
private List<message> messages_recus ;
@OneToMany(mappedBy="membre")
private List<commentaire_membre> commentaires ; 
@OneToMany(mappedBy="membre")
private List<article> articles ;
@ManyToMany
@JoinTable(name="mem_proj", joinColumns=@JoinColumn(name="Mem_ID",referencedColumnName="id_membre"),
inverseJoinColumns=@JoinColumn(name="ID_PROJ",referencedColumnName="id"))
private List<projet> projets_participes ;
@OneToMany(mappedBy="chef_projet")
private List<projet> projets_supervises ;
@OneToMany(mappedBy="membre")
private  List<activite> diplomes_formations ;
private activite  activite_enseignement ;
private activite activite_recherche ;
private  String position_actuelle ;

	public membre() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public membre(long id_membre, String nom_prenom, String date_naissance, String email, boolean isAdmin,
			String lien_photo_profil, String[] numero_tel, String passwd, String titre, String status, String adresse,
			String alias, String num_cin, List<message> messages_envoyes, List<message> messages_recus,
			List<commentaire_membre> commentaires, List<article> articles, List<projet> projets_participes,
			List<projet> projets_supervises, List<activite> diplomes_formations, activite activite_enseignement,
			activite activite_recherche, String position_actuelle) {
		super();
		this.id_membre = id_membre;
		this.nom_prenom = nom_prenom;
		this.date_naissance = date_naissance;
		this.email = email;
		this.isAdmin = isAdmin;
		this.lien_photo_profil = lien_photo_profil;
		this.numero_tel = numero_tel;
		this.passwd = passwd;
		this.titre = titre;
		this.status = status;
		this.adresse = adresse;
		this.alias = alias;
		this.num_cin = num_cin;
		this.messages_envoyes = messages_envoyes;
		this.messages_recus = messages_recus;
		this.commentaires = commentaires;
		this.articles = articles;
		this.projets_participes = projets_participes;
		this.projets_supervises = projets_supervises;
		this.diplomes_formations = diplomes_formations;
		this.activite_enseignement = activite_enseignement;
		this.activite_recherche = activite_recherche;
		this.position_actuelle = position_actuelle;
	}

	public activite getActivite_enseignement() {
		return activite_enseignement;
	}

	public void setActivite_enseignement(activite activite_enseignement) {
		this.activite_enseignement = activite_enseignement;
	}

	public activite getActivite_recherche() {
		return activite_recherche;
	}

	public void setActivite_recherche(activite activite_recherche) {
		this.activite_recherche = activite_recherche;
	}

	public String getNom_prenom() {
		return nom_prenom;
	}

	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}


	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLien_photo_profil() {
		return lien_photo_profil;
	}

	public void setLien_photo_profil(String lien_photo_profil) {
		this.lien_photo_profil = lien_photo_profil;
	}

	public long getId_membre() {
		return id_membre;
	}

	public void setId_membre(long id_membre) {
		this.id_membre = id_membre;
	}
	@JsonIgnore
	@XmlTransient
	public List<commentaire_membre> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<commentaire_membre> commentaires) {
		this.commentaires = commentaires;
	}

	

	public String[] getNumero_tel() {
		return numero_tel;
	}

	public void setNumero_tel(String[] numero_tel) {
		this.numero_tel = numero_tel;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getNum_cin() {
		return num_cin;
	}

	public void setNum_cin(String num_cin) {
		this.num_cin = num_cin;
	}
	@JsonIgnore
	@XmlTransient
	public List<article> getArticles() {
		return articles;
	}

	public void setArticles(List<article> articles) {
		this.articles = articles;
	}
	@JsonIgnore
	@XmlTransient
	public List<projet> getProjets_participes() {
		return projets_participes;
	}

	public void setProjets_participes(List<projet> projets_participes) {
		this.projets_participes = projets_participes;
	}
	@JsonIgnore
	@XmlTransient
	public List<projet> getProjets_supervises() {
		return projets_supervises;
	}

	public void setProjets_supervises(List<projet> projets_supervises) {
		this.projets_supervises = projets_supervises;
	}
@JsonIgnore
@XmlTransient
	public List<activite> getDiplomes_formations() {
		return diplomes_formations;
	}
	@JsonIgnore
	@XmlTransient
	public List<message> getMessages_envoyes() {
	return messages_envoyes;
}

public void setMessages_envoyes(List<message> messages_envoyes) {
	this.messages_envoyes = messages_envoyes;
}
@JsonIgnore
@XmlTransient
public List<message> getMessages_recus() {
	return messages_recus;
}

public void setMessages_recus(List<message> messages_recus) {
	this.messages_recus = messages_recus;
}

	public void setDiplomes_formations(List<activite> diplomes_formations) {
		this.diplomes_formations = diplomes_formations;
	}

	public String getPosition_actuelle() {
		return position_actuelle;
	}

	public void setPosition_actuelle(String position_actuelle) {
		this.position_actuelle = position_actuelle;
	}
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getLien_cv() {
		return lien_cv;
	}

	public void setLien_cv(String lien_cv) {
		this.lien_cv = lien_cv;
	}


	

}
