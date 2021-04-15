package com.grad.SistemaVacinacao.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Estoque_vacina")
public class EstoqueVacina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	private BigDecimal preço;

	private Integer quantidade;

	@Override
	public int hashCode() {
		return Objects.hash(id, preço, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EstoqueVacina)) {
			return false;
		}
		EstoqueVacina other = (EstoqueVacina) obj;
		return Objects.equals(id, other.id) && Objects.equals(preço, other.preço)
				&& Objects.equals(quantidade, other.quantidade);
	}

}
