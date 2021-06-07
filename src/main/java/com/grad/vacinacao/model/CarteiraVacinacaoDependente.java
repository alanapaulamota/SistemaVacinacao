package com.grad.vacinacao.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe model referente à carteira de vacinação de dependentes, contém:
 * atributos, equals e hashcode.Além dos construtores e getters/setters gerados
 * pelo lombok.
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carteira_dependente")
public class CarteiraVacinacaoDependente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	
	@Column(name = "nome")
	private String nome;

	@Length(max = 16, message = "*A idade do dependente deve ser menor do que 16 anos")
	@Column(name = "idade")
	private Integer idade;

	@Column(name = "sexo")
	private String sexo;

	@OneToOne
	private User usuario;
	
	@OneToMany
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