package com.banco.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.repository.ContaBancariaRepository;

@Service
public class ContaBancariaSerices {

	@Autowired
	private ContaBancariaRepository contaBancariaRepository;
	
	public void deletar(Integer id) {
		contaBancariaRepository.deleteById(id);
	}
	
}

