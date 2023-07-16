package com.banco.model;

import com.banco.model.Localizacao;


/**
 * Agencia
 */
public class Agencia {
    private Integer identificador;
    private Localizacao localizacao;
    private Integer quantClientes;

    
    public Agencia(Integer identificador, Localizacao localizacao, Integer quantClientes) {
		super();
		this.identificador = identificador;
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