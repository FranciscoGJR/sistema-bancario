package com.banco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.model.Agencia;
import com.banco.model.Cliente;
import com.banco.repository.AgenciaRepository;
import com.banco.repository.ClienteRepository;

@Service
public class AgenciaServices {

	@Autowired
	AgenciaRepository agenciaRepository;

	public Agencia create(Agencia agencia) {
		return agenciaRepository.save(agencia);
	}

	public List<Agencia> findAll() {
		return agenciaRepository.findAll();
	}

}
