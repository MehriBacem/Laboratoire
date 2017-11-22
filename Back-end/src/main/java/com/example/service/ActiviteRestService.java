package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.activite;
import com.example.metier.ActiviteMetier;
@RestController
public class ActiviteRestService {
	
	@Autowired
	private ActiviteMetier activiteMetier ;
	@RequestMapping(value="/activites",method=RequestMethod.PUT)
	public activite updateActivite(@RequestBody  activite a) {
		return activiteMetier.updateActivite(a);
	}
	@RequestMapping(value="/activites",method=RequestMethod.POST)
	public activite saveActivite(@RequestBody activite a) {
		return activiteMetier.saveActivite(a);
	}
	@RequestMapping(value="/activites/{id}",method=RequestMethod.GET)
	public activite getActivite( @PathVariable long id) {
		return activiteMetier.getActivite( id);
	}
	@RequestMapping(value="/activites/{id}",method=RequestMethod.DELETE)
	public void deleteActivite(@PathVariable long id){
		activiteMetier.deleteActivite(id);
	}

}
