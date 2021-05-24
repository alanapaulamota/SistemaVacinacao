package com.grad.sistemaVacinacao.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carteira_dependente")
public class CarteiraVacinacaoDependente {

	@Column(name = "id")
	private Long id;
	@Column(name = "nome")
	private String nome;

	@Length(max = 16, message = "*A idade do dependente deve ser menor do que 16 anos")
	@Column(name = "idade")
	private Integer idade;

	@Column(name = "sexo")
	private String sexo;

	private User usuario;
	private List<ItemCarteiraVacinacao> vacinacoes;

	@Override
	public int hashCode() {
		return Objects.hash(id, idade, nome, usuario, vacinacoes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CarteiraVacinacaoDependente)) {
			return false;
		}
		CarteiraVacinacaoDependente other = (CarteiraVacinacaoDependente) obj;
		return Objects.equals(id, other.id) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(usuario, other.usuario) && Objects.equals(vacinacoes, other.vacinacoes);
	}

}
