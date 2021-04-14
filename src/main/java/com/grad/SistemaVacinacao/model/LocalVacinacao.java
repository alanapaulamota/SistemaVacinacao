package com.grad.SistemaVacinacao.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LocalVacinacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	private String nome;

	private String endereco;

	private String complemento;

	private String cep;

	private String telefone;

	@Override
	public int hashCode() {
		return Objects.hash(cep, complemento, endereco, id, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof LocalVacinacao)) {
			return false;
		}
		LocalVacinacao other = (LocalVacinacao) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(complemento, other.complemento)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}

	@Override
	public String toString() {
		return "local de vacinação [id=" + id + ", nome=" + nome + "]";
	}

}
