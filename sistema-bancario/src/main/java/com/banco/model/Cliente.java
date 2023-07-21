package com.banco.model;

import java.lang.Integer;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

/**
 * Cliente
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer identificador;

    private String nome;
    
    @OneToOne
    private ContaBancaria contaBancaria;
    
    private LocalDate nascimento;


    /**
     * Construtor que define informações básicas do cliente
     * @param String : Nome do cliente
     * @param ContaBancaria : Conta Bancaria do cliente
     */
    public Cliente(String nome, ContaBancaria contaBancaria){
        this.nome = nome;
        this.contaBancaria = contaBancaria;
    
    }


    public Integer getIdentificador(){
        return identificador;
    }

    public void setIdentificador(Integer identificador){
        this.identificador = identificador;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

    public ContaBancaria getContaBancaria(){
        return this.contaBancaria;
    }
    
    public void setContaBancaria(ContaBancaria contaBancaria){
        this.contaBancaria = contaBancaria;
    }


	@Override
	public String toString() {
		return "Cliente [identificador=" + identificador + ", nome=" + nome + ", contaBancaria=" + contaBancaria.toString()
				+ ", nascimento=" + nascimento + "]";
	}

    
}