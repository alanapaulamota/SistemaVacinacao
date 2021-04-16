package com.grad.sistemaVacinacao.model;
//package com.grad.svn.model;
//
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.Column;
//
//import org.hibernate.validator.constraints.Length;
//
//public class CarteiraVacinacaoDependente {
//
//	@Column(name = "carteiraVacinacaoDependente_id")
//	private Long id;
//	@Column(name = "dependente_name")
//	private String nome;
//
//	@Length(max = 16, message = "*A idade do dependente deve ser menor do que 16 anos")
//	@Column(name = "dependente_idade")
//	private Integer idade;
//
//	@Column(name = "dependente_sexo")
//	private String sexo;
//
//	private User usuario;
//	private List<ItemCarteiraVacinacao> vacinacoes;
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, idade, nome, usuario, vacinacoes);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof CarteiraVacinacaoDependente)) {
//			return false;
//		}
//		CarteiraVacinacaoDependente other = (CarteiraVacinacaoDependente) obj;
//		return Objects.equals(id, other.id) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
//				&& Objects.equals(usuario, other.usuario) && Objects.equals(vacinacoes, other.vacinacoes);
//	}
//
//}
