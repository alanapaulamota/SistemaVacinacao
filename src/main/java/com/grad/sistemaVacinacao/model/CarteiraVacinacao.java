package com.grad.sistemaVacinacao.model;
//package com.grad.svn.model;
//
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "carteiraVacinacao")
//public class CarteiraVacinacao {
//
//	@Column(name = "carteiraVacinacao_id")
//	private Long id;
//	private User usuario;
//	private List<ItemCarteiraVacinacao> vacinacoes;
//
////....
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof CarteiraVacinacao)) {
//			return false;
//		}
//		CarteiraVacinacao other = (CarteiraVacinacao) obj;
//		return Objects.equals(id, other.id) && Objects.equals(usuario, other.usuario)
//				&& Objects.equals(vacinacoes, other.vacinacoes);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, usuario, vacinacoes);
//	}
//
//}
