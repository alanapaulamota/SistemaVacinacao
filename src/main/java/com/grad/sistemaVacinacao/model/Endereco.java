package com.grad.sistemaVacinacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.grad.sistemaVacinacao.model.enumeration.UF;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereco")
@Entity
public class Endereco {

	@NotNull
	@Column(nullable = false)
	private String logradouro;

	@NotNull
	@Column(nullable = false)
	private String bairro;

	@NotNull
	@Column(nullable = false)
	private String cidade;

	@NotNull
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;

	@NotNull
	@Column(nullable = false, length = 9)
	private String cep;

	@NotNull
	@Column(nullable = false, length = 5)
	private Integer numero;

	@NotNull
	@Column(nullable = false)
	private String complemento;

	@NotNull
	@Column(nullable = false)
	private String telefone;

}
