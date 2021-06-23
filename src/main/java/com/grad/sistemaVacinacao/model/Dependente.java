package com.grad.sistemaVacinacao.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dependente")
public class Dependente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

 	@NotEmpty
	@Column(name = "nome")
	private String nome;

	@Column(name = "data")
	@NotEmpty(message = "*Forneça uma data de nascimento válida")
	private Date data;

 	@NotEmpty
	@Column(name = "sexo")
	private String sexo;

	@Column(name = "mae")
	@NotEmpty(message = "*Digite o nome de sua Mãe")
	private String mae;

	@Column(name = "pai")
	private String pai;
}
