package com.banco.model;

import java.lang.Integer;
import java.lang.Long;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * Conta Bancaria
 */
@Entity
public class ContaBancaria{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero;
    private Long saldo;
    private Integer idTitular;
    private Integer idAgencia;


    /**
     * Construtor que define informações básicas da conta bancaria
     * @param Integer : Identificador do cliente titular da conta
     * @param Integer : Identificador da agencia criadora
     */
    public ContaBancaria(Integer idTitular, Integer idAgencia){
        saldo = 0L;
        this.idTitular = idTitular;
        this.idAgencia = idAgencia;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public Long getSaldo(){
        return saldo;
    }

    public void setSaldo(Long saldo){
        this.saldo = saldo;
    }

    public Integer getIdTitular(){
        return idTitular;
    }

    public void setIdTitular(Integer idTitular){
        this.idTitular = idTitular;
    }

    public Integer getIdAgencia(){
        return idAgencia;
    }

    public void setIdAgenda(Integer idAgenda){
        this.idAgencia = idAgenda;
    }


    public String toString(){
        return
        "ContaBancaria [numero=" + numero + ", saldo=" + saldo + " , idTitular=" + idTitular + " , idAgencia=" + idAgencia + "]";
    }

}