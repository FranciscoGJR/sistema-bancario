package com.banco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.model.Cliente;
import com.banco.repository.ClienteRepository;
import com.banco.repository.ContaBancariaRepository;

@Service
public class ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ContaBancariaRepository contaBancariaRepository;

	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Cliente findById(Integer id) throws Exception {
		Optional<Cliente> clienteOptional = clienteRepository.findById(id);

		if (clienteOptional.isPresent()) {
			return clienteOptional.get();
		} else {
			throw new Exception("Cliente não encontrado para o ID: " + id);
		}

	}

	public Cliente update(Cliente cliente, Integer id) {
		cliente.setIdentificador(id);
		return clienteRepository.save(cliente);
	}

	public void deletar(Integer id) {
		System.out.println("TENTANDO DELETAR");
		contaBancariaRepository.deleteById(id);
		clienteRepository.deleteById(id);
	}

}
