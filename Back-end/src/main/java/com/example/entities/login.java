package com.example.entities;

public class login {

	
 private  String alias ;
 private String  passwd ;
 
public String getAlias() {
	return alias;
}
public void setAlias(String alias) {
	this.alias = alias;
}
public String getPasswd() {
	return passwd;
}
public void setPasswd(String passwd) {
	this.passwd = passwd;
}
public login(String alias, String passwd) {
	super();
	this.alias = alias;
	this.passwd = passwd;
}
public login() {
	super();
	// TODO Auto-generated constructor stub
}

}
