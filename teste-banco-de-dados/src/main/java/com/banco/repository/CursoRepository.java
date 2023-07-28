package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
