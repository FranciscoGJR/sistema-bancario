package com.banco.model;

import java.lang.Integer;
import java.time.LocalDate;

import com.banco.model.ContaBancaria;

/**
 * Cliente
 */
public class Cliente {
    private Integer identificador;
    private String nome;
    private ContaBancaria contaBancaria;
    private LocalDate nascimento;


    /**
     * Construtor que define informações básicas do cliente
     * @param Integer : Identificador do cliente
     * @param String : Nome do cliente
     * @param ContaBancaria : Conta Bancaria do cliente
     */
    public Cliente(Integer identificador, String nome, ContaBancaria contaBancaria){
        this.identificador = identificador;
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


	@Override
	public String toString() {
		return "Cliente [identificador=" + identificador + ", nome=" + nome + ", contaBancaria=" + contaBancaria.toString()
				+ ", nascimento=" + nascimento + "]";
	}

    
}