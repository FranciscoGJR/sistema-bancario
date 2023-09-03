package com.toolBox;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.toolBox.Model.Box;
import com.toolBox.Model.Pagina;

@SpringBootApplication
public class Tool0boxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Tool0boxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TESTE BASICO DE IMPLEMENTAÇÃO
		Pagina paginaTeste = new Pagina(1, "Pagina Teste", "0.0.0.0");
		System.out.println(paginaTeste.toString());
		
		List<Pagina> paginas = new ArrayList<>();
		paginas.add(paginaTeste);
		
		Box boxTeste = new Box(1, "BOX 1", paginas);
		System.out.println(boxTeste.toString());
		
	}

}
