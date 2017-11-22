package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ActiviteRepository;
import com.example.entities.activite;
@Service
public  class ActiviteMetierImpl implements ActiviteMetier{
	@Autowired
  private ActiviteRepository activiteRepository ;
	@Override
	public activite saveActivite(activite a) {
		// TODO Auto-generated method stub
		return activiteRepository.save(a);
	}

	@Override
	public activite getActivite(long id) {
		// TODO Auto-generated method stub
		return activiteRepository.findOne(id);
	}

	@Override
	public void deleteActivite(long a) {
		// TODO Auto-generated method stub
		activiteRepository.delete(a);
	}

	@Override
	public activite updateActivite(activite a) {
		// TODO Auto-generated method stub
		return activiteRepository.save(a) ;
	}





}
