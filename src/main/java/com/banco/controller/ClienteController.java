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

import com.banco.model.Cliente;
import com.banco.services.ClienteServices;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteServices clienteServices;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente criar(@RequestBody Cliente cliente) {
		return clienteServices.criar(cliente);
	}

	@GetMapping
	public List<Cliente> buscarTodos() {
		return clienteServices.findAll();
	}

	@GetMapping(value = "/{id}")
	public Cliente buscarPorID(@PathVariable("id") Integer id) throws Exception {
		return clienteServices.findById(id);
	}

	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente atualizar(@PathVariable("id") Integer id, @RequestBody Cliente cliente) {
		return clienteServices.update(cliente, id);
	}

	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		clienteServices.deletar(id);
	}

}
