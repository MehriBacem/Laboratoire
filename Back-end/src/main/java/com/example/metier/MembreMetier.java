package com.example.metier;

import java.util.List;

import com.example.entities.login;
import com.example.entities.membre;

public interface MembreMetier {
	
	public membre saveMembre(membre m);
	public List<membre> ListMembres();
	public membre getMembre(long id );
	public membre  VerifMembre(login login);

}
