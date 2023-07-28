package com.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

	// Fazer busca utilizando o campo nome completo
	List<Curso> findCursoByNome(String nome);
	
	
	// Fazer busca utilizando o campo nome com o LIKE
	List<Curso> findCursoByNomeContaining(String valor);

	
	// Fazer busca utilizando o campo nome com o LIKE e ignore case
	List<Curso> findCursoByNomeIgnoreCase(String valor);
	
}
