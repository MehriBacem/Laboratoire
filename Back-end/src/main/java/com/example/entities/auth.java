package com.example.entities;

public class auth {
	
	private  String res ;
	private  long id ;
	public auth(String res, long id) {
		super();
		this.res = res;
		this.id = id;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	
}
