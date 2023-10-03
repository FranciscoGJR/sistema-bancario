package com.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

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

	@OneToOne
	@JoinColumn(name = "id_cartao", referencedColumnName = "id_cartao")
	private Cartao cartao;

	public ContaBancaria() {
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