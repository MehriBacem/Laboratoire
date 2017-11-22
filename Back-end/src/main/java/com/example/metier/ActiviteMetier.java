package com.example.metier;

import java.util.List;

import com.example.entities.activite;
import com.example.entities.membre;

public interface ActiviteMetier {
	public activite saveActivite(activite a);
	public  activite getActivite(long id) ;
	public  void  deleteActivite(long a) ;
	public activite updateActivite(activite a);
	
}
