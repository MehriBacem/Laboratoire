package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.commentaire;
import com.example.metier.ActiviteMetier;
import com.example.metier.CommentaireMetier;
@RestController
public class CommentaireRestService {
	
	@Autowired
	private CommentaireMetier commentaireMetier ;
	@RequestMapping(value="/commentaires",method=RequestMethod.POST)
	public commentaire saveActivite(@RequestBody commentaire c) {
		return commentaireMetier.saveActivite(c);
	}
	@RequestMapping(value="/commentaires/{id}",method=RequestMethod.GET)
	public commentaire getCommentaire(@PathVariable long id) {
		return commentaireMetier.getCommentaire(id);
	}
	@RequestMapping(value="/commentaires/{a}",method=RequestMethod.DELETE)
	public void deleteCommentaire(@PathVariable long a) {
		commentaireMetier.deleteCommentaire(a);
	}

}
