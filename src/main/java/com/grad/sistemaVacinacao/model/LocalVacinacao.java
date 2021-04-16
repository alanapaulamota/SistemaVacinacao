package com.grad.sistemaVacinacao.model;
//package com.grad.svn.model;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Table(name = "localVacinacao")
//public class LocalVacinacao implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "localVacinacao_id")
//	private Long id;
//
//	@Column(name = "vacina_name")
//	private String nome;
//
//	@Column(name = "vacina_endereco")
//	private String endereco;
//
//	@Column(name = "vacina_complemento")
//	private String complemento;
//
//	@Column(name = "vacina_cep")
//	private String cep;
//
//	@Column(name = "vacina_telefone")
//	private String telefone;
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(cep, complemento, endereco, id, nome, telefone);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof LocalVacinacao)) {
//			return false;
//		}
//		LocalVacinacao other = (LocalVacinacao) obj;
//		return Objects.equals(cep, other.cep) && Objects.equals(complemento, other.complemento)
//				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
//				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
//	}
//
//	@Override
//	public String toString() {
//		return "local de vacinação [id=" + id + ", nome=" + nome + "]";
//	}
//
//}
