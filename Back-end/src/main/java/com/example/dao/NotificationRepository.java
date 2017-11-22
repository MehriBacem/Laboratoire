package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.notification;

public interface NotificationRepository extends JpaRepository<notification, Long> {

}
