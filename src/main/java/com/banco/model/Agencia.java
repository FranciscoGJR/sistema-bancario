package com.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Cliente")
	private Integer identificador;

	@Column
	private Integer quantClientes;

	public Agencia() {
	}

	public Agencia(Integer quantClientes) {
		this.quantClientes = quantClientes;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public Integer getQuantClientes() {
		return quantClientes;
	}

	public void setQuantClientes(Integer quantClientes) {
		this.quantClientes = quantClientes;
	}

	@Override
	public String toString() {
		return "Agencia [identificador=" + identificador + ", quantClientes=" + quantClientes + "]";
	}

}