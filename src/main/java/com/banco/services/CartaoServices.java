package com.banco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.model.Cartao;
import com.banco.repository.CartaoRepository;

@Service
public class CartaoServices {

	@Autowired
	private CartaoRepository cartaoRepository;

	public Cartao create(Cartao cartao) {
		return cartaoRepository.save(cartao);
	}

	public List<Cartao> findAll() {
		return cartaoRepository.findAll();
	}

	public Cartao findById(Integer id) throws Exception {
		Optional<Cartao> cartaoOptional = cartaoRepository.findById(id);

		if (cartaoOptional.isPresent()) {
			return cartaoOptional.get();
		} else {
			throw new Exception("Cartao não encontrado para o ID: " + id);
		}
	}

	public Cartao update(Cartao cartao, Integer id) {
		cartao.setIdentificador(id);
		return cartaoRepository.save(cartao);
	}

	public void delete(Integer id) {
		cartaoRepository.deleteById(id);
	}
}
