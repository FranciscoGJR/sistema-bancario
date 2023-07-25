package com.banco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banco.model.Cliente;
import com.banco.model.ContaBancaria;
import com.banco.repository.ClienteRepository;
import com.banco.repository.ContaBancariaRepository;

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
