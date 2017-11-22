package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ReferenceRepository;
import com.example.entities.reference;
@Service
public class ReferenceMetierImpl implements ReferenceMetier{
@Autowired
private ReferenceRepository referenceRepository ;
	@Override
	public reference saveReference(reference r) {
		// TODO Auto-generated method stub
		return referenceRepository.save(r);
	}

	@Override
	public reference getReference(long id) {
		// TODO Auto-generated method stub
		return referenceRepository.findOne(id);
	}

	@Override
	public void deleteReference(long a) {
		// TODO Auto-generated method stub
		referenceRepository.delete(a);
	}

	@Override
	public reference updateReference(reference r) {
		// TODO Auto-generated method stub
		return referenceRepository.save(r);
	}

}
