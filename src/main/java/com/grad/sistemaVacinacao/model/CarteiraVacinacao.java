package com.grad.sistemaVacinacao.model;

import java.util.List;
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

/**
 * Classe model referente à carteira de vacinação contém: atributos, equals e
 * hashcode.Além dos construtores e getters/setters gerados pelo lombok.
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carteira")
public class CarteiraVacinacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	
	private User usuario;
	private List<ItemCarteiraVacinacao> vacinacoes;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CarteiraVacinacao)) {
			return false;
		}
		CarteiraVacinacao other = (CarteiraVacinacao) obj;
		return Objects.equals(id, other.id) && Objects.equals(usuario, other.usuario)
				&& Objects.equals(vacinacoes, other.vacinacoes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, usuario, vacinacoes);
	}

}
