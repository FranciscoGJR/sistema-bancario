package com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banco.services.ContaBancariaSerices;

@Controller
@RequestMapping("/conta-bancaria")
public class ContaBancariaController {

	@Autowired
	ContaBancariaSerices contaBancariaSerices;
	
	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		contaBancariaSerices.deletar(id);
	}
	
}
