package com.grad.vacinacao.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Classe model referente ao Item Carteira de Vacinação, contém: atributos,
 * equals e hashcode.Além dos construtores e getters/setters gerados pelo
 * lombok.
 * 
 */
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item_carteira")
public class ItemCarteiraVacinacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	
	@ManyToOne
	private Vacina vacina;
	@ManyToOne
	private EstoqueVacina estoque;
	@ManyToOne
	private Funcionario funcionario;
	@ManyToOne
	private LocalVacinacao localVacinacao;
	@ManyToOne
	private User user;

	@NotNull
	private String observacao;

	@Override
	public int hashCode() {
		return Objects.hash(estoque, funcionario, id, localVacinacao, observacao, user, vacina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ItemCarteiraVacinacao)) {
			return false;
		}
		ItemCarteiraVacinacao other = (ItemCarteiraVacinacao) obj;
		return Objects.equals(estoque, other.estoque) && Objects.equals(funcionario, other.funcionario)
				&& Objects.equals(id, other.id) && Objects.equals(localVacinacao, other.localVacinacao)
				&& Objects.equals(observacao, other.observacao) && Objects.equals(user, other.user)
				&& Objects.equals(vacina, other.vacina);
	}

}
