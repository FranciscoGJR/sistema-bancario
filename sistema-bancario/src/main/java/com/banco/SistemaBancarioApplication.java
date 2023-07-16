package com.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banco.model.Cliente;
import com.banco.model.ContaBancaria;

@SpringBootApplication
public class SistemaBancarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaBancarioApplication.class, args);
		
		ContaBancaria conta_a = new ContaBancaria(100, 1, 1000);
		Cliente cliente_a = new Cliente(1, "Ronaldo", conta_a);
		
		System.out.println(cliente_a.toString());
	}

}
