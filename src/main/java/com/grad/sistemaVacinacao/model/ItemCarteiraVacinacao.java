package com.grad.sistemaVacinacao.model;
//package com.grad.svn.model;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Objects;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//public class ItemCarteiraVacinacao implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private Vacina vacina;
//	private java.util.Date data;
//	private BigDecimal valor;
//	private Enfermeiro enfermeiro;
//	private LocalVacinacao localVacinacao;
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(data, enfermeiro, id, localVacinacao, vacina, valor);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof ItemCarteiraVacinacao)) {
//			return false;
//		}
//		ItemCarteiraVacinacao other = (ItemCarteiraVacinacao) obj;
//		return Objects.equals(data, other.data) && Objects.equals(enfermeiro, other.enfermeiro)
//				&& Objects.equals(id, other.id) && Objects.equals(localVacinacao, other.localVacinacao)
//				&& Objects.equals(vacina, other.vacina) && Objects.equals(valor, other.valor);
//	}
//
//}