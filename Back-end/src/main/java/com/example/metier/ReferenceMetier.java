package com.example.metier;

import com.example.entities.projet;
import com.example.entities.reference;

public interface ReferenceMetier {
	public reference  saveReference(reference r);
	public  reference getReference(long id) ;
	public  void  deleteReference(long a) ;
	public reference updateReference(reference r);
}
