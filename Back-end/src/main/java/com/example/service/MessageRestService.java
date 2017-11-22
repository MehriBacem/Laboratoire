package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Conv;
import com.example.entities.Mess;
import com.example.entities.auth;
import com.example.entities.login;
import com.example.entities.membre;
import com.example.entities.message;
import com.example.metier.MessageMetier;
@RestController
public class MessageRestService {
	
	@Autowired
	private MessageMetier messageMetier;
	@RequestMapping(value="/messages",method=RequestMethod.POST)
	public message saveMessage(@RequestBody  message m) {
		return messageMetier.saveMessage(m);
	}
	@RequestMapping(value="/messages/{id}",method=RequestMethod.GET)
	public message getMessage(@PathVariable long id) {
		return messageMetier.getMessage(id);
	}
	@RequestMapping(value="/messages/{a}",method=RequestMethod.DELETE)
	public void deleteMessage( @PathVariable long a) {
		messageMetier.deleteMessage(a);
	}
	@RequestMapping(value="/messages",method=RequestMethod.PUT)
	public message updateMessage(@RequestBody  message a) {
		return messageMetier.updateMessage(a);
	}
	@RequestMapping(value="/message",method=RequestMethod.POST)
	public  List<Conv>  VerifMessage(@RequestBody  Mess  m)
	{ 
            
		return messageMetier.verifMessage(m);
		
		
	}
	@RequestMapping(value="/messages",method=RequestMethod.GET)
	public List<message> ListMessages() {
		return messageMetier.ListMessages() ;
	}
	
	

}
