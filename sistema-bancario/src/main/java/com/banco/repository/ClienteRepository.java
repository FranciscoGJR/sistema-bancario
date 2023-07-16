package com.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.banco.model.Cliente;
import com.banco.model.ContaBancaria;

@Repository
public class ClienteRepository {

	
	public List<Cliente> listarTodos(){
		int totalCliente = 5;
		List<Cliente> listaClientes = new ArrayList<>();
		
		for(int i = 0; i < totalCliente; i++) {
			String nomeCliente = "Carlos" + i;
			ContaBancaria contaBancariaCliente = new ContaBancaria(i + 100, i, i + 1000);
			Cliente cliente = new Cliente(i, nomeCliente, contaBancariaCliente);
		
			listaClientes.add(cliente);
		}
		
		return listaClientes;
	}
	
}
