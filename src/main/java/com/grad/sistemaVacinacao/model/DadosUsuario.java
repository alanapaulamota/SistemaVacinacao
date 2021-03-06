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
@Table(name = "dados")
public class DadosUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dados_id")
	private Integer id;

	@Column(name = "data")
	@NotEmpty(message = "*Forneça uma data de nascimento válida")
	private Date data;
	
	@Column(name = "telefone")
	@NotEmpty(message = "*Forneça um telefone válido")
	private String telefone;
	
	@Column(name = "endereco")
	@NotEmpty(message = "*Forneça um endereco válido")
	private String endereco;
	
	@Column(name = "complemento")
 	@NotEmpty(message = "*Forneça complemento complemento válido")
	private String complemento;
	
	@Column(name = "cep")
 	@NotEmpty
	private String cep;
	
	@Column(name = "sexo")
 	@NotEmpty
	private String sexo;
	
	@Column(name = "rg")
 	@NotEmpty(message = "*Forneça um rg válido")
	private String rg;
	
	
	@Column(name = "mae")
	@NotEmpty(message = "*Digite o nome de sua Mãe")
	private String mae;
	
	@Column(name = "pai")
	private String pai;
	
	@Column(name = "sus")
	private String cartaoSus;
//	
//
//	@ManyToMany(cascade = CascadeType.MERGE)
//	@JoinTable(name = "dados_user", joinColumns = @JoinColumn(name = "dados_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
//	private Set<User> usuarios;
//
//
//	public Integer getId() {
//		return id;
//	}

}
