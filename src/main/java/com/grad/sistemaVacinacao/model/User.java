package com.grad.sistemaVacinacao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

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
	private String userName;
	@Column(name = "email")
	@Email(message = "*Por favor forneça um email válido")
	@NotEmpty(message = "*Forneça um email válido")
	private String email;
	@Column(name = "senha")
	@Length(min = 5, message = "*Sua senha deve ter pelo menos 5 caracteres")
	@NotEmpty(message = "*Por favor, forneça sua senha")
	private String password;
	@Column(name = "nome")
	@NotEmpty(message = "*Por favor, forneça seu nome")
	private String name;
	@Column(name = "sobrenome")
	@NotEmpty(message = "*Por favor, forneça sua sobrenome")
	private String lastName;
	@Column(name = "active")
	private Boolean active;
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

}
