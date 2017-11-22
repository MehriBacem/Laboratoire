package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.NouveauteRepository;
import com.example.entities.nouveaute;
@Service
public class NouveauteMetierImpl implements NouveauteMetier {
	@Autowired
	private NouveauteRepository nouveauteRepository ;

	@Override
	public nouveaute saveNouveaute(nouveaute n) {
		// TODO Auto-generated method stub
		return nouveauteRepository.save(n);
	}

	@Override
	public nouveaute getNouveaute(long id) {
		// TODO Auto-generated method stub
		return nouveauteRepository.findOne(id);
	}

	@Override
	public void deleteNouveaute(long a) {
		// TODO Auto-generated method stub
		nouveauteRepository.delete(a);
	}

	@Override
	public nouveaute updateNouveaute(nouveaute a) {
		// TODO Auto-generated method stub
		return nouveauteRepository.save(a);
	}
	

}
