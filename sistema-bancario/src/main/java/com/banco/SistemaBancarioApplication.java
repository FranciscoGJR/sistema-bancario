package com.banco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banco.controller.ClienteController;
import com.banco.model.Cliente;
import com.banco.model.ContaBancaria;
import com.banco.repository.ClienteRepository;
import com.banco.repository.ClienteRepository;
import com.banco.repository.ContaBancariaRepository;
import com.banco.services.ClienteServices;

@SpringBootApplication
public class SistemaBancarioApplication implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRepositoryInterface;
	
	@Autowired
	private ContaBancariaRepository contaBancariaRepositoryInterface;  
	
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


	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = new Cliente("Alex", null);
		
		ContaBancaria conta_1 = new ContaBancaria(cliente.getIdentificador(), 10);
		cliente.setContaBancaria(conta_1);
		
		contaBancariaRepositoryInterface.save(conta_1);
		clienteRepositoryInterface.save(cliente);
	}

}
