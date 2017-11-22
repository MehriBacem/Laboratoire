package com.example.metier;

import com.example.entities.message;
import com.example.entities.notification;

public interface NotificationMetier {
	
	public  notification saveNotification(notification n);
	public  notification getNotification(long id) ;
	public  void  deleteNotification(long a) ;
	public notification updateNotification(notification a);

}
