package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProjetRepository;
import com.example.entities.projet;
@Service
public class ProjetMetierImpl implements ProjetMetier {
@Autowired
private  ProjetRepository projetRepository ;
	@Override
	public projet saveProjet(projet p) {
		// TODO Auto-generated method stub
		return projetRepository.save(p);
	}

	@Override
	public projet getProjet(long id) {
		// TODO Auto-generated method stub
		return projetRepository.findOne(id);
	}

	@Override
	public void deleteProjet(long a) {
		// TODO Auto-generated method stub
		projetRepository.delete(a);
	}

	@Override
	public projet updateProjet(projet a) {
		// TODO Auto-generated method stub
		return projetRepository.save(a);
	}
	

}
