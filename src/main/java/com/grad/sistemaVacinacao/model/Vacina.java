package com.grad.sistemaVacinacao.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vacina")
public class Vacina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vacina_id")
	private Long id;

	@Column(name = "vacina_name")
	private String nome;

	@Column(name = "vacina_descricao")
	private String descricao;

	@Column(name = "vacina_fabricante")
	private String fabricante;


	@Override
	public int hashCode() {
		return Objects.hash(descricao, fabricante, id, nome);
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
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}



	@Override
	public String toString() {
		return "Vacina [id=" + id + ", nome=" + nome + "]";
	}

}
