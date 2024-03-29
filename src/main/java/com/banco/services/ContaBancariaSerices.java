package com.banco.services;

import java.util.List;
import java.util.Optional;

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

	public List<ContaBancaria> findAll() {
		return contaBancariaRepository.findAll();
	}

	public ContaBancaria findById(Integer id) throws Exception {
		Optional<ContaBancaria> contaBancariaOptional = contaBancariaRepository.findById(id);

		if (contaBancariaOptional.isPresent()) {
			return contaBancariaOptional.get();
		} else {
			throw new Exception("Cartao não encontrado para o ID: " + id);
		}
	}

	public ContaBancaria update(ContaBancaria contaBancaria, Integer id) {
		contaBancaria.setNumero(id);
		return contaBancariaRepository.save(contaBancaria);
	}

	public void deletar(Integer id) {
		contaBancariaRepository.deleteById(id);
	}

}
