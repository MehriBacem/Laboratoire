package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.activite;

public interface ActiviteRepository extends JpaRepository<activite,Long> {

}
