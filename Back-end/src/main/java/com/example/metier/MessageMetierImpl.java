package com.example.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MessageRepository;
import com.example.entities.Conv;
import com.example.entities.Mess;
import com.example.entities.membre;
import com.example.entities.message;
@Service
public class MessageMetierImpl implements MessageMetier {
   @Autowired
	private MessageRepository messageRepository ;
	
	@Override
	public message saveMessage(message m) {
		// TODO Auto-generated method stub
		return messageRepository.save(m);
	}

	@Override
	public message getMessage(long id) {
		// TODO Auto-generated method stub
		return messageRepository.findOne(id);
	}

	@Override
	public void deleteMessage(long id) {
		// TODO Auto-generated method stub
		messageRepository.delete(id);
	}

	@Override
	public message updateMessage(message a) {
		// TODO Auto-generated method stub
		return  messageRepository.save(a); 
	}

	@Override
	public List<Conv> verifMessage(Mess m) {
	 long  id2 = m.getId_dest() ;
	 long id1 = m.getId_source() ;
	 List<Conv>   T=null ;
	  List<message> l1= ListMessages();
	  
		for(int i=0;i<l1.size();i++ )
		{
			message message = l1.get(i) ;
			if((id1==message.getSource().getId_membre())&&(id2==message.getDestination().getId_membre()))
			{  Conv  c =new Conv(message.getContenue(),"conversation-right");
			      T.add(c);
			      }
			else 
			{
				if((id2==message.getSource().getId_membre())&&(id1==message.getDestination().getId_membre()))
				{  Conv  c =new Conv(message.getContenue(),"conversation-left");
				      T.add(c);
				      }
			}
		}
		
		return T;
	}

	@Override
	public List<message> ListMessages() {
		// TODO Auto-generated method stub
		return  messageRepository.findAll();
	}

}
