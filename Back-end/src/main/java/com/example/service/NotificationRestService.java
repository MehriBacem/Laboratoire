package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.notification;
import com.example.metier.NotificationMetier;

@RestController
public class NotificationRestService {

	
	@Autowired
	private NotificationMetier notificationMetier ;
	@RequestMapping(value="/notifications",method=RequestMethod.POST)
	public notification saveNotification(@RequestBody notification n) {
		return notificationMetier.saveNotification(n);
	}
	@RequestMapping(value="/notifications/{id}",method=RequestMethod.GET)
	public notification getNotification( @PathVariable long id) {
		return notificationMetier.getNotification(id);
	}
	@RequestMapping(value="/notifications/{a}",method=RequestMethod.DELETE)
	public void deleteNotification( @PathVariable long a) {
		notificationMetier.deleteNotification(a);
	}
	@RequestMapping(value="/notifications",method=RequestMethod.PUT)
	public notification updateNotification(@RequestBody notification a) {
		return notificationMetier.updateNotification(a);
	}
}
