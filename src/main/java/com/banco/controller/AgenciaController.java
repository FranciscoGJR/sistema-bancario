package com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

}
