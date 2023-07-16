package com.banco;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banco.model.Cliente;
import com.banco.repository.ClienteRepository;

@SpringBootApplication
public class SistemaBancarioApplication {

	public static void divisoria(String titulo) {
		System.out.println("================== " + titulo + " ==================");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaBancarioApplication.class, args);
		
		
		divisoria("Teste ClineteRepository.listarTodos()");
		ClienteRepository clienteRepository = new ClienteRepository();
		
		List<Cliente> listaClientes = clienteRepository.listarTodos();
		
		for(Cliente cliente : listaClientes)
			System.out.println(cliente.toString());
	}

}
