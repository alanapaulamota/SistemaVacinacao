package com.grad.SistemaVacinacao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "vacina")
public class Vacina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	private String nome;

	private String tipo;

	private String descricao;

	private String fabricante;

	@ManyToMany
	private Set<EstoqueVacina> estoqueVacinas;

	@Override
	public int hashCode() {
		return Objects.hash(descricao, fabricante, id, nome, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vacina)) {
			return false;
		}
		Vacina other = (Vacina) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(fabricante, other.fabricante)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "Vacina [id=" + id + ", nome=" + nome + "]";
	}

}
