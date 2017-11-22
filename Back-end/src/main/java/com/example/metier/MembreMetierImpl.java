package com.example.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MembreRepository;
import com.example.entities.login;
import com.example.entities.membre;
@Service
public class MembreMetierImpl implements MembreMetier {
	@Autowired
   private MembreRepository   membreRespository ;
	@Override
	public membre saveMembre(membre m) {
		// TODO Auto-generated method stub
		return membreRespository.save(m);
	}

	@Override
	public List<membre> ListMembres() {
		// TODO Auto-generated method stub
		return membreRespository.findAll();
	}
	public membre getMembre(long id )
	{
		return membreRespository.findOne(id) ;
	}

	@Override
	public membre VerifMembre(login login) {
		List<membre> liste = ListMembres() ;
		int i=0 ;
		while (i<liste.size() )
		{
			membre membre = liste.get(i) ;
			if(membre.getAlias()!=null && membre.getPasswd()!=null )
		if((membre.getAlias().equals(login.getAlias()))&&(membre.getPasswd().equals(login.getPasswd()))){
				return membre ;
			}
			i++;
		}

		return null ;
	}
}
