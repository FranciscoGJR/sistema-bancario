package com.banco.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(nullable = false)
	private String area;

	@CreationTimestamp
	@Column(name = "data_de_criacao")
	private LocalDate dataDeCriacao;

	@UpdateTimestamp
	@Column(name = "data_de_atualizacao")
	private LocalDate dataDeAtualizacao;

	/**
	 * Construtor que define informações básicas de um curso
	 * 
	 * @param String : nome do curso
	 */
	public Curso(String nome, String area) {
		this.nome = nome;
		this.area = area;
	}

	/**
	 * Construtor padrão de um curso
	 */
	public Curso() {
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", area=" + area + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public LocalDate getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(LocalDate dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public LocalDate getDataDeAtualizacao() {
		return dataDeAtualizacao;
	}

	public void setDataDeAtualizacao(LocalDate dataDeAtualizacao) {
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

}
