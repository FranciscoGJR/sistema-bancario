package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.ContaBancaria;

@Repository
public interface ContaBancariaRepository  extends JpaRepository<ContaBancaria, Integer>{

}
