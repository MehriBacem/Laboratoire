package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.NotificationRepository;
import com.example.entities.notification;
@Service
public class NotificationMetierImpl implements NotificationMetier {

	
	@Autowired
	private NotificationRepository notificationRepository;
	@Override
	public notification saveNotification(notification n) {
		// TODO Auto-generated method stub
		return notificationRepository.save(n);
	}

	@Override
	public notification getNotification(long id) {
		// TODO Auto-generated method stub
		return notificationRepository.findOne(id);
	}

	@Override
	public void deleteNotification(long a) {
		// TODO Auto-generated method stub
		notificationRepository.delete(a);
	}

	@Override
	public notification updateNotification(notification a) {
		// TODO Auto-generated method stub
		return notificationRepository.save(a);
	}

}
