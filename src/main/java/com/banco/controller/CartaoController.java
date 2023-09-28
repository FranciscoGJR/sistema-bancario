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

import com.banco.model.Cartao;
import com.banco.services.CartaoServices;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

	@Autowired
	private CartaoServices cartaoServices;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cartao create(@RequestBody Cartao cartao) {
		return cartaoServices.create(cartao);
	}

	@GetMapping
	public List<Cartao> listAll() {
		return cartaoServices.findAll();
	}

	@GetMapping(value = "/{id}")
	public Cartao findById(@PathVariable("id") Integer id) throws Exception {
		return cartaoServices.findById(id);
	}

	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cartao update(@PathVariable("id") Integer id, @RequestBody Cartao cartao) {
		return cartaoServices.update(cartao, id);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		cartaoServices.delete(id);
	}

}
