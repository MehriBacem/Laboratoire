package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.message;

public interface MessageRepository  extends JpaRepository<message, Long>{

}
