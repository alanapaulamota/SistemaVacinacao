package com.grad.vacinacao.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Classe model referente ao cargo do funcionário, contém: atributos, equals e
 * hashcode.Além dos construtores e getters/setters gerados pelo lombok.
 * 
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cargo")
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "nome")
	@NotEmpty(message = "*Por favor, forneça seu nome")
	private String nome;

	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private LocalVacinacao localVacinacao;

	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;
}