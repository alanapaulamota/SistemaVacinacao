package com.grad.vacinacao.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe model referente ao Usuário contém: atributos, equals e
 * hashcode.Além dos construtores e getters/setters gerados pelo lombok.
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "apelido")
	@Length(min = 5, message = "*Seu nome de usuário deve ter pelo menos 5 caracteres")
	@NotEmpty(message = "*Forneça um nome de usuário")
	private String apelido;
	@Column(name = "email")
	@Email(message = "*Por favor forneça um email válido")
	@NotEmpty(message = "*Forneça um email válido")
	private String email;
	@Column(name = "senha")
	@Length(min = 5, message = "*Sua senha deve ter pelo menos 5 caracteres")
	@NotEmpty(message = "*Por favor, forneça sua senha")
	private String senha;
	@Column(name = "nome")
	@NotEmpty(message = "*Por favor, forneça seu nome")
	private String nome;
	@Column(name = "sobrenome")
	@NotEmpty(message = "*Por favor, forneça sua sobrenome")
	private String sobreNome;
	@Column(name = "active")
	private Boolean active;
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

}
