package com.banco.services;

import com.banco.repository.ClienteRepository;
import com.banco.model.Cliente;

public class ClienteServices {

	ClienteRepository clienteRepository = new ClienteRepository();
	
	public List<Cliente> listarTodos() {
		return clienteRepository.listarTodos();
	}
}
