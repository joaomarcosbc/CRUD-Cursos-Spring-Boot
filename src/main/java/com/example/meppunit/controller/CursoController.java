package com.example.meppunit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.meppunit.model.Curso;
import com.example.meppunit.repository.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<Curso> listar() {
		return cursoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Curso adicionar(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
	
}
