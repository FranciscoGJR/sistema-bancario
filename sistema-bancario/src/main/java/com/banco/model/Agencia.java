package com.banco.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

/**
 * Agencia
 */
@Entity
public class Agencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer identificador;

	@ManyToOne
	private Localizacao localizacao;
	
	@OneToMany(mappedBy = "agencia")
	private List<Cliente> clientes = new ArrayList<>();

	private Integer quantClientes;

	/**
	 * Construtor que define informações básicas da agencia
	 * 
	 * @param Localizaca : localizacao da agencia
	 * @param Integer    : quantidade de clientes na agencia
	 */
	public Agencia(Localizacao localizacao, Integer quantClientes) {
		this.localizacao = localizacao;
		this.quantClientes = quantClientes;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Integer getQuantClientes() {
		return quantClientes;
	}

	public void setQuantClientes(Integer quantClientes) {
		this.quantClientes = quantClientes;
	}

	@Override
	public String toString() {
		return "Agencia [identificador=" + identificador + ", localizacao=" + localizacao + ", quantClientes="
				+ quantClientes + "]";
	}

}