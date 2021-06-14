package com.example.meppunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.meppunit.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
	
}
