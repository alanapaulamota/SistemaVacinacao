package com.grad.sistemaVacinacao.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Classe model referente ao funcionário de vacinação contém: atributos, equals
 * e hashcode.Além dos construtores e getters/setters gerados pelo lombok.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String email;

	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	@NotNull
	private BigDecimal salario;

	@Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
	@NotNull
	private LocalDate dataEntrada;

	@Column(name = "data_saida", columnDefinition = "DATE")
	@NotNull
	private LocalDate dataSaida;

	@NotNull
	private String cpf;

	@NotNull
	private String cargo;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "endereco_id_fk")
//	private Endereco endereco;
//
//	@ManyToOne
//	@JoinColumn(name = "cargo_id_fk")
//	private Cargo cargo;

}