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
////TODO fluxo
////// TELA INICIAL (index) com alguma info ... publica ----> link de login/logout
//// ----> cadastrar etc ...
////TODO incluir remeber me
//
//@Table(name = "enfermeiro")
//public class Enfermeiro implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "enfermeiro_id")
//	private Long id;
//
//	@Column(name = "enfermeiro_nome")
//	private String nome;
//
//	@Column(name = "enfermeiro_email")
//	private String email;
//
//	// TODO É necessario?
//	@Column(name = "enfermeiro_id")
//	private String data;
//
//	@Column(name = "enfermeiro_cpf")
//	private String cpf;
//
//	@Column(name = "enfermeiro_rg")
//	private String rg;
//
//	@Column(name = "enfermeiro_endereco")
//	private String endereco;
//
//	@Column(name = "enfermeiro_complemento")
//	private String complemento;
//
//	@Column(name = "enfermeiro_cep")
//	private String cep;
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(rg, cep, complemento, cpf, data, email, endereco, id, nome);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Enfermeiro)) {
//			return false;
//		}
//		Enfermeiro other = (Enfermeiro) obj;
//		return Objects.equals(rg, other.rg) && Objects.equals(cep, other.cep)
//				&& Objects.equals(complemento, other.complemento) && Objects.equals(cpf, other.cpf)
//				&& Objects.equals(data, other.data) && Objects.equals(email, other.email)
//				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
//				&& Objects.equals(nome, other.nome);
//	}
//
//	@Override
//	public String toString() {
//		return "CadastroEnfermeiro [id=" + id + ", nome=" + nome + "]";
//	}
//}