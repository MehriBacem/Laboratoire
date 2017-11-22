package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ActiviteRepository;
import com.example.dao.CommentaireRepository;
import com.example.entities.commentaire;
@Service
public class CommentaireMetierImpl implements CommentaireMetier{

	@Autowired
	  private CommentaireRepository commentaireRepository ;
	@Override
	public commentaire saveActivite(commentaire c) {
		// TODO Auto-generated method stub
		return commentaireRepository.save(c);
	}

	@Override
	public commentaire getCommentaire(long id) {
		// TODO Auto-generated method stub
		return commentaireRepository.findOne(id);
	}

	@Override
	public void deleteCommentaire(long a) {
		// TODO Auto-generated method stub
		commentaireRepository.delete(a);
	}

	@Override
	public commentaire updateCommentaire(commentaire c) {
		// TODO Auto-generated method stub
		return commentaireRepository.save(c);
	}
	

}
