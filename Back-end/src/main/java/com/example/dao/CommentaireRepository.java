package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.commentaire;

public interface CommentaireRepository extends JpaRepository<commentaire, Long> {

}
