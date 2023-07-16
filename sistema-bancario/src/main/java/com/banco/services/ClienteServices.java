package com.banco.services;

import com.banco.repository.ClienteRepository;
import com.banco.model.Cliente;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ClienteServices {

	ClienteRepository clienteRepository = new ClienteRepository();
	
	public List<Cliente> listarTodos() {
		return clienteRepository.listarTodos();
	}
}
