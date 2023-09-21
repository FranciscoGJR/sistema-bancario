package com.banco.model;

import com.banco.model.Cliente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ContaBancaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Conta_Bancaria")
	private Integer numero;

	@Column
	private Long saldo;

	@ManyToOne()
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	public ContaBancaria(Integer idTitular, Integer idAgencia) {
		saldo = 0L;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Long getSaldo() {
		return saldo;
	}

	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
	}

}