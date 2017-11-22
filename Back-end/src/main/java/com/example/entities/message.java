package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class message implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	private Date date ;
  private 	String temps ;
  private String contenue ;
  @ManyToOne
  @JoinColumn(name="ID_SOURCE")
  private membre source ; 
  @ManyToOne
  @JoinColumn(name="ID_Destination")
  private membre destination ;
  

	public message(Date date, String temps, String contenue, membre source, membre destination) {
	super();
	this.date = date;
	this.temps = temps;
	this.contenue = contenue;
	this.source = source;
	this.destination = destination;
}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getTemps() {
	return temps;
}

public void setTemps(String temps) {
	this.temps = temps;
}

public String getContenue() {
	return contenue;
}

public void setContenue(String contenue) {
	this.contenue = contenue;
}

public membre getSource() {
	return source;
}

public void setSource(membre source) {
	this.source = source;
}

public membre getDestination() {
	return destination;
}

public void setDestination(membre destination) {
	this.destination = destination;
}

	public message() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	 
	
}
