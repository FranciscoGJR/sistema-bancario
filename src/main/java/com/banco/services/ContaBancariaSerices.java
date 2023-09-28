package com.banco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.model.ContaBancaria;
import com.banco.repository.ContaBancariaRepository;

@Service
public class ContaBancariaSerices {

	@Autowired
	private ContaBancariaRepository contaBancariaRepository;
	
	public ContaBancaria create(ContaBancaria contaBancaria) {
		return contaBancariaRepository.save(contaBancaria);
	}
	
	public List<ContaBancaria> findAll(){
		return contaBancariaRepository.findAll();
	}
	
	public void deletar(Integer id) {
		contaBancariaRepository.deleteById(id);
	}
	
}

