package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.nouveaute;
import com.example.metier.NouveauteMetier;

@RestController
public class NouveauteRestService {
	@Autowired
	private NouveauteMetier nouveauteMetier ;
	@RequestMapping(value="/nouveautes",method=RequestMethod.POST)
	public nouveaute saveNouveaute( @RequestBody nouveaute n) {
		return nouveauteMetier.saveNouveaute(n);
	}
	@RequestMapping(value="/nouveautes/{id}",method=RequestMethod.GET)
	public nouveaute getNouveaute(@PathVariable long id) {
		return nouveauteMetier.getNouveaute(id);
	}
	@RequestMapping(value="/nouveautes/{a}",method=RequestMethod.DELETE)
	public void deleteNouveaute(@PathVariable long a) {
		nouveauteMetier.deleteNouveaute(a);
	}
	@RequestMapping(value="/nouveautes",method=RequestMethod.PUT)
	public nouveaute updateNouveaute( @RequestBody nouveaute a) {
		return nouveauteMetier.updateNouveaute(a);
	}
	
	

}
