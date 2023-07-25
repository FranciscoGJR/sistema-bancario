package com.banco.services;

import com.banco.repository.ClienteRepository;
import com.banco.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;
	
	/**
     * Metodo para adicionar cliente no banco
     * @param Cliente : Cliente que sera armazenado no banco
     */
	public Cliente criar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
