package com.example.entities;

public class Mess {
	
	private   long id_source ;
	private long id_dest ;
	public Mess() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mess(long id_source, long id_dest) {
		super();
		this.id_source = id_source;
		this.id_dest = id_dest;
	}
	public long getId_source() {
		return id_source;
	}
	public void setId_source(long id_source) {
		this.id_source = id_source;
	}
	public long getId_dest() {
		return id_dest;
	}
	public void setId_dest(long id_dest) {
		this.id_dest = id_dest;
	}
	
	

}
