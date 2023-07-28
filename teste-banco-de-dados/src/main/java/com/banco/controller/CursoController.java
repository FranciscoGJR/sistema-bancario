package com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.model.Curso;
import com.banco.services.CursoServices;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired 
	CursoServices cursoServices;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso create(@RequestBody Curso curso) {
		
		return cursoServices.create(curso);
	}
	
	
	@GetMapping()
	public List<Curso> listAll() {
		return cursoServices.findAll();
	}
	
	
	@GetMapping(value = "/{id}")
	public Curso findById(@PathVariable("id") Integer id) throws Exception {
		
		return cursoServices.findById(id);
		
	}
	
	
	@GetMapping(value = "nome/{nome}")
	public List<Curso> findCursoByNome(@PathVariable("nome") String nome){
		
		return cursoServices.findCursoByNome(nome);
	}
	
	
	@GetMapping(value = "nomeContaining/{busca}")
	public List<Curso> findCursoByNomeContaining(@PathVariable("busca") String valor){
		
		return cursoServices.findCursoByNomeContaining(valor);
	}

	
	@GetMapping(value = "nomeIgnoreCase/{busca}")
	public List<Curso> findCursoByNomeIgnoreCase(@PathVariable("busca") String valor){
		
		return cursoServices.findCursoByNomeIgnoreCase(valor);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Integer id){
		
		cursoServices.deleteById(id); 
	}
	
}
