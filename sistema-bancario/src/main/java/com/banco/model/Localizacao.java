package com.banco.model;

import java.lang.String;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * Localizacao
 */
@Entity
public class Localizacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer identificador;
	
    String pais;
    String estado;
    String cidade;
    String logradouro;
    String numero;
    
    /**
     * Construtor que define informações básicas do cliente
     * @param Strign : pais da localizacao
     * @param Strign : estado da localizacao
     * @param Strign : cidade da localizacao
     * @param Strign : logradouro da localizacao
     * @param Strign : numero da localizacao
     */
    public Localizacao(String pais, String estado, String cidade, String logradouro, String numero) {
		super();
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numero = numero;
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
    
    
    
}