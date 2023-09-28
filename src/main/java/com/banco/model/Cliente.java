package com.banco.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer identificador;

	@Column(name = "nome")
	private String nome;

	@OneToMany(mappedBy = "cliente")
	private List<ContaBancaria> contas = new ArrayList<>();

	// private ContaBancaria contaBancaria;

	// private Agencia agencia;

	@Column(name = "nascimento")
	private LocalDate nascimento;

	public Cliente() {
	}

	public Cliente(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Cliente [identificador=" + identificador + ", nome=" + nome + ", nascimento=" + nascimento + "]";
	}

}