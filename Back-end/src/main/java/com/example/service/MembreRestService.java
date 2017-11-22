
package com.example.service;

import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.auth;
import com.example.entities.login;
import com.example.entities.membre;
import com.example.metier.MembreMetier;

import ch.qos.logback.core.net.SyslogOutputStream;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class MembreRestService {

	@Autowired
	private MembreMetier  membreMetier ;
@RequestMapping(value="/membres",method=RequestMethod.POST)
	public membre saveMembre(@RequestBody membre m) {	
	return membreMetier.saveMembre(m);
		
	}
@RequestMapping(value="/membres",method=RequestMethod.GET)
	public List<membre> ListMembres() {
		return membreMetier.ListMembres();
	}
	@RequestMapping(value="/membres/{id}",method=RequestMethod.GET)
	public membre getMembre(@PathVariable long id)
	{
		return membreMetier.getMembre(id) ;
	}
	
	@RequestMapping(value="/auth",method=RequestMethod.POST)
	public  auth  Verif(@RequestBody  login  l)
	{   membre membre = membreMetier.VerifMembre(l);
             if(membre==null) return new auth("error",0);
             else
		return new auth("authorized",membre.getId_membre()) ;
		
		
	}
	
}
