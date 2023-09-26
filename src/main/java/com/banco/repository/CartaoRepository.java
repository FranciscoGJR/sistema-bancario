
package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Integer>{
	
}
