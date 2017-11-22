package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.reference;

public interface ReferenceRepository extends JpaRepository<reference, Long> {

}
