
package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.example.entities.membre;

public interface MembreRepository  extends JpaRepository <membre,Long>
{

}
