package com.grad.SistemaVacinacao.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "enfermeiro")
public class Enfermeiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	private String nome;

	private String email;

	private String data;

	private String cpf;

	private String RG;

	private String endereco;

	private String complemento;

	private String cep;

	@Override
	public int hashCode() {
		return Objects.hash(RG, cep, complemento, cpf, data, email, endereco, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Enfermeiro)) {
			return false;
		}
		Enfermeiro other = (Enfermeiro) obj;
		return Objects.equals(RG, other.RG) && Objects.equals(cep, other.cep)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(data, other.data) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "CadastroEnfermeiro [id=" + id + ", nome=" + nome + "]";
	}
}