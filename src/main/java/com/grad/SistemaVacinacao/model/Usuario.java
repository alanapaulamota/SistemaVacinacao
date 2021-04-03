package com.grad.SistemaVacinacao.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Criando classe model com os respectivos atributos(nome,cpf,idade,email)
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	private String nome;

	private String username;

	private String email;

	private String data;

	private String cpf;

	private String RG;

	private String endereco;

	private String complemento;

	private String cep;

	private String sexo;

	private String nomeMae;

	private String nomePai;

	private String cartaoSus;

	private String senha;

	private String confirmaSenha;

	@ManyToMany
	private Set<Role> roles;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
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

}
