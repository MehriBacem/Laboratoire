package com.example.metier;

import com.example.entities.notification;
import com.example.entities.nouveaute;

public interface NouveauteMetier {
	public  nouveaute saveNouveaute(nouveaute n);
public  nouveaute getNouveaute(long id) ;
public  void  deleteNouveaute(long a) ;
public nouveaute updateNouveaute(nouveaute a);

}
