package com.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "grade")
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String objetivo;

	@OneToOne
	@JoinColumn(name = "aluno_id", referencedColumnName = "id")
	private Aluno aluno;

	public Grade(String objetivo, Aluno aluno) {
		super();
		this.objetivo = objetivo;
		this.aluno = aluno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", objetivo=" + objetivo + ", aluno=" + aluno + "]";
	}



}
