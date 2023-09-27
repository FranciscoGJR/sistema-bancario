package com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.model.Agencia;
import com.banco.services.AgenciaServices;

@RestController
@RequestMapping("/agencia")
public class AgenciaController {

	@Autowired
	AgenciaServices agenciaServices;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Agencia criar(@RequestBody Agencia agencia) {
		return agenciaServices.create(agencia);
	}

	@GetMapping()
	public List<Agencia> buscarTodos() {
		return agenciaServices.findAll();
	}

	@GetMapping(value = "/{id}")
	public Agencia buscarPorId(@PathVariable("id") Integer id) throws Exception {
		return agenciaServices.findById(id);
	}
}
