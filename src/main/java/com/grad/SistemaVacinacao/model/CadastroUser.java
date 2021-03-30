package com.grad.SistemaVacinacao.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Criando classe model com os respectivos atributos(nome,cpf,idade,email)
@Entity // Anotação que indica que a classe é uma entidade do banco de dados
@Table(name = "cadastroUser") // Anotação indica nome da tabela a ser criada no banco de dados
public class CadastroUser {// implements UserDetails {
	private static final long serialVersionUID = 1L;

	/**
	 * Anotação para indicar que o campo id é identificados da entidade e será
	 * gerado pelo banco de dados
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no no maximo 255 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "nome", length = 255, nullable = false)
	@Size(max = 255)
	@NotBlank(message = " não pode estar em branco")
	private String nome;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no minimo 5 e no maximo 254 caracteres, não pode ser nulo e é unico.
	 */
	@Size(min = 5, max = 254)
	@NotBlank(message = " não pode estar em branco")
	@Column(length = 254, unique = true, nullable = false)
	private String email;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no no maximo 255 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "data", length = 10, nullable = false)
	@Size(max = 10)
	@NotBlank(message = " não pode estar em branco")
	private String data;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 11 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "cpf", length = 11, nullable = false, unique = true)
	@NotBlank(message = " não pode estar em branco")
	private String cpf;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 8 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "RG", length = 8, nullable = false, unique = true)
	@NotBlank(message = " não pode estar em branco")
	private String RG;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no no maximo 255 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "endereco", length = 255, nullable = false)
	@Size(max = 255)
	@NotBlank(message = " não pode estar em branco")
	private String endereco;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no no maximo 255 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "complemento", length = 255, nullable = false)
	@Size(max = 255)
	@NotBlank(message = " não pode estar em branco")
	private String complemento;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 11 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "cep", length = 11, nullable = false, unique = true)
	@NotBlank(message = " não pode estar em branco")
	private String cep;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 3 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "sexo", length = 3, nullable = false, unique = true)
	@NotBlank(message = " não pode estar em branco")
	private String sexo;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 3 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "nomeMae", length = 255, nullable = false, unique = true)
	@NotBlank(message = " não pode estar em branco")
	private String nomeMae;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 3 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "nomePai", length = 255, nullable = false, unique = true)
	@NotBlank(message = " não pode estar em branco")
	private String nomePai;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 11 caracteres, não pode ser nulo e é unico.
	 */
	@Column(name = "cartaoSus", length = 11, nullable = true, unique = true)
	private String cartaoSus;

	/**
	 * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 60 caracteres, não pode ser nulo e é unico.
	 */
	@NotBlank(message = " não pode estar em branco")
	@Column(length = 60, nullable = false)
	private String senha;

	/**
	 * * Anotação que define uma coluna no banco de dados cujo o valor do atributo
	 * pode ter no maximo 60 caracteres, não pode ser nulo e é unico.
	 */
	@Transient
	@NotBlank(message = " não pode estar em branco")
	@Column(length = 60, nullable = false)
	private String confirmaSenha;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CadastroUser)) {
			return false;
		}
		CadastroUser other = (CadastroUser) obj;
		return Objects.equals(RG, other.RG) && Objects.equals(cartaoSus, other.cartaoSus)
				&& Objects.equals(cep, other.cep) && Objects.equals(complemento, other.complemento)
				&& Objects.equals(confirmaSenha, other.confirmaSenha) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(data, other.data) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(senha, other.senha)
				&& Objects.equals(sexo, other.sexo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(RG, cartaoSus, cep, complemento, confirmaSenha, cpf, data, email, endereco, id, nome,
				nomeMae, nomePai, senha, sexo);
	}

	// Gerando toString
	@Override
	public String toString() {
		return "CadastroUsuario [id=" + id + ", nome=" + nome + "]";
	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//		return this.senha;
//	}
//
//	@Override
//	public String getUsername() {
//		return this.cpf;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//	// CRIANDO GETTERS E SETTER COM LOMBOK

}
