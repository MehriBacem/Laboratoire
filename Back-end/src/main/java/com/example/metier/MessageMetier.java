package com.example.metier;

import java.util.List;

import com.example.entities.Conv;
import com.example.entities.Mess;
import com.example.entities.activite;
import com.example.entities.message;

public interface MessageMetier {
	public  message saveMessage(message m);
	public  message getMessage(long id) ;
	public  void  deleteMessage(long a) ;
	public message updateMessage(message a);
	public   List<Conv> verifMessage(Mess m) ;
	public List<message> ListMessages();
}
