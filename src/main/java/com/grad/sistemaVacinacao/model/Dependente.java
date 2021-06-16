//package com.grad.sistemaVacinacao.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import com.grad.sistemaVacinacao.model.enumeration.Posto;
//import com.grad.sistemaVacinacao.model.enumeration.Vacinas;
//
//@Entity
//public class Dependente {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	
//	@Column(name = "nome")
//	private String nome;
//	
//	@Column(name = "curso")
//	private Posto curso;
//	
//	@Column(name = "matricula")
//	private String matricula;
//	
//	@Column(name = "status")
//	private Vacinas status;
//	
//	
//	
//	public Vacinas getStatus() {
//		return status;
//	}
//	public void setStatus(Vacinas status) {
//		this.status = status;
//	}
//	private String turno;
//	
//	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public Posto getCurso() {
//		return curso;
//	}
//	public void setCurso(Posto curso) {
//		this.curso = curso;
//	}
//	public String getMatricula() {
//		return matricula;
//	}
//	public void setMatricula(String matricula) {
//		this.matricula = matricula;
//	}
//
//	public String getTurno() {
//		return turno;
//	}
//	public void setTurno(String turno) {
//		this.turno = turno;
//	}
//		
//}
