package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.projet;
import com.example.metier.ProjetMetier;
@RestController
public class ProjetRestService {
	@Autowired
	private ProjetMetier em ;
	@RequestMapping(value="/projets",method=RequestMethod.POST)
	public projet saveProjet(@RequestBody projet p) {
		return em.saveProjet(p);
	}
	@RequestMapping(value="/projets/{id}",method=RequestMethod.GET)
	public projet getProjet( @PathVariable long id) {
		return em.getProjet(id);
	}
	@RequestMapping(value="/projets/{a}",method=RequestMethod.DELETE)
	public void deleteProjet( @PathVariable long a) {
		em.deleteProjet(a);
	}
	@RequestMapping(value="/projets",method=RequestMethod.PUT)
	public projet updateProjet(@RequestBody projet a) {
		return em.updateProjet(a);
	}

}
