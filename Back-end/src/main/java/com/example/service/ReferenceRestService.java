package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.reference;
import com.example.metier.ReferenceMetier;
@RestController
public class ReferenceRestService {
	@Autowired
	private  ReferenceMetier referenceMetier ;
	@RequestMapping(value="/references",method=RequestMethod.POST)
	public reference saveReference(@RequestBody reference r) {
		return referenceMetier.saveReference(r);
	}
	@RequestMapping(value="/references/{id}",method=RequestMethod.GET)
	public reference getReference(@PathVariable long id) {
		return referenceMetier.getReference(id);
	}
	@RequestMapping(value="/references/{a}",method=RequestMethod.DELETE)
	public void deleteReference(@PathVariable long a) {
		referenceMetier.deleteReference(a);
	}
	@RequestMapping(value="/references",method=RequestMethod.PUT)
	public reference updateReference(@RequestBody reference r) {
		return referenceMetier.updateReference(r);
	}
  
	
}
