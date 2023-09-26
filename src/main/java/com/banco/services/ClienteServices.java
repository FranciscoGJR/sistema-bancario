package com.banco.services;

import com.banco.repository.ClienteRepository;
import com.banco.repository.ContaBancariaRepository;
import com.banco.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ContaBancariaRepository contaBancariaRepository;
	
	public Cliente criar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
    public void deletar(Integer id) {
    	System.out.println("TENTANDO DELETAR");
    	contaBancariaRepository.deleteById(id);
    	clienteRepository.deleteById(id);
    }
	
}
