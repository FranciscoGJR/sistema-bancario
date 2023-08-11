package com.banco;

import java.time.LocalDate;

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
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ContaBancariaRepository contaBancariaRepository;  
	
	public static void divisoria(String titulo) {
		System.out.println("\n================== " + titulo + " ==================");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaBancarioApplication.class, args);
	
		
	}


	@Override
	public void run(String... args) throws Exception {
		
		int numCliente = 10;
		for(int i = 1; i < 10; i++) {
			Cliente cliente = new Cliente("Alex" + i + "", null, LocalDate.of(2023, 7, 25));
			ContaBancaria conta = new ContaBancaria(cliente.getIdentificador(), 10 + i);
			
			cliente.setContaBancaria(conta);
			
			contaBancariaRepository.save(conta);
			clienteRepository.save(cliente);
		}
		
		
	}

}
