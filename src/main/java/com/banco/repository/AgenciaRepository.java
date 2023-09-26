package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.Agencia;

@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Integer>{

}
