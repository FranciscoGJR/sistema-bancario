package com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.model.ContaBancaria;
import com.banco.services.ContaBancariaSerices;

@RestController
@RequestMapping("/contaBancaria")
public class ContaBancariaController {

	@Autowired
	ContaBancariaSerices contaBancariaSerices;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ContaBancaria criar(@RequestBody ContaBancaria contaBancaria) {
		return contaBancariaSerices.create(contaBancaria);
	}

	@GetMapping
	public List<ContaBancaria> buscarTodos() {
		return contaBancariaSerices.findAll();
	}

	@GetMapping(value = "/{id}")
	public ContaBancaria buscarPorId(@PathVariable("id") Integer id) throws Exception {
		return contaBancariaSerices.findById(id);
	}

	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ContaBancaria atualizar(@RequestBody ContaBancaria contaBancaria, @PathVariable("id") Integer id) {
		return contaBancariaSerices.update(contaBancaria, id);
	}

	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		contaBancariaSerices.deletar(id);
	}

}
