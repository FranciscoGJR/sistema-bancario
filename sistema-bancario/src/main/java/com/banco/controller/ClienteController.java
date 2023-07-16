package com.banco.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.model.Cliente;
import com.banco.services.ClienteServices;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	//@Autowired
	ClienteServices clienteService = new ClienteServices ();
	
	@GetMapping
	public List<Cliente> listarTodos(){
		return clienteService.listarTodos();
	}
}
