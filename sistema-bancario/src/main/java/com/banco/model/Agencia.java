package com.banco.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


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
    private Integer quantClientes;
    
    /**
     * Construtor que define informações básicas da agencia
     * @param Localizaca : localizacao da agencia
     * @param Integer : quantidade de clientes na agencia
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