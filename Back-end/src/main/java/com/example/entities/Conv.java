package com.example.entities;

public class Conv {
	
	
	private  String  contenue ;
	private String   dir ;
	public Conv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conv(String contenue, String type) {
		super();
		this.contenue = contenue;
		this.dir = type;
	}
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String type) {
		this.dir = type;
	}
	
	

}
