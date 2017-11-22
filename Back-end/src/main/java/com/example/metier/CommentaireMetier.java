package com.example.metier;

import java.util.List;

import com.example.entities.activite;
import com.example.entities.commentaire;

public interface CommentaireMetier {
	
	
	public commentaire saveActivite(commentaire c);
	public  commentaire getCommentaire(long id) ;
	public  void  deleteCommentaire(long a) ;
	public commentaire  updateCommentaire(commentaire c);
	

}
