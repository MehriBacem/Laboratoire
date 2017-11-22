package com.example.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.jpamodelgen.xml.jaxb.DiscriminatorType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="TYPE_REFERENCE",
		discriminatorType = javax.persistence.DiscriminatorType.STRING 
		)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="type")
@JsonSubTypes(
		{
@Type(name="ART",value=article.class),
@Type(name="FOR",value=forum.class)
		}
		)
public abstract class reference implements Serializable  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id ;
	@OneToMany(mappedBy="reference")
	private List<commentaire> commentaires ;
	@JsonIgnore
	@XmlTransient
public List<commentaire> getCommentaires() {
		return commentaires;
	}

	public reference(long id, List<commentaire> commentaires) {
		super();
		this.id = id;
		this.commentaires = commentaires;
	}

	public void setCommentaires(List<commentaire> commentaires) {
		this.commentaires = commentaires;
	}

public long getId() {
	return id;
}

public reference() {
	super();
	// TODO Auto-generated constructor stub
}

public void setId(long id) {
	this.id = id;
}

public reference(long id) {

	this.id = id;
}

}
