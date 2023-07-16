package com.banco;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banco.controller.ClienteController;
import com.banco.model.Cliente;
import com.banco.repository.ClienteRepository;
import com.banco.services.ClienteServices;

@SpringBootApplication
public class SistemaBancarioApplication {

	public static void divisoria(String titulo) {
		System.out.println("\n================== " + titulo + " ==================");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaBancarioApplication.class, args);
		
		//================ Teste ClineteRepository.listarTodos()
		divisoria("Teste ClineteRepository.listarTodos()");
		ClienteRepository clienteRepository = new ClienteRepository();
		
		List<Cliente> listaClientes = clienteRepository.listarTodos();
		
		for(Cliente cliente : listaClientes)
			System.out.println(cliente.toString());
		
		
		//================ Teste ClienteRepository.listarTodos()
		divisoria("Teste ClienteService.listarTodos()");
		ClienteServices clienteService = new ClienteServices();
		
		listaClientes = clienteService.listarTodos();
		for(Cliente cliente : listaClientes)
			System.out.println(cliente.toString());
		
		
		//================ Teste ClienteController.listarTodos()
		divisoria("Teste ClienteController.listarTodos()");
		ClienteController clienteController = new ClienteController();
		
		listaClientes = clienteController.listarTodos();
		for(Cliente cliente : listaClientes)
			System.out.println(cliente.toString());
		
	}

}
