package com.example.metier;

import com.example.entities.notification;
import com.example.entities.projet;

public interface ProjetMetier {
	public  projet saveProjet(projet p);
	public  projet getProjet(long id) ;
	public  void  deleteProjet(long a) ;
	public projet updateProjet(projet a);

}
