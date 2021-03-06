//package com.grad.sistemaVacinacao.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import com.grad.sistemaVacinacao.model.enumeration.UF;
//import com.sun.istack.NotNull;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;
//
///**
// * Classe model referente ao endereço, contém: atributos, equals e hashcode.Além
// * dos construtores e getters/setters gerados pelo lombok.
// * 
// */
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "endereco")
//@Entity
//public class Endereco {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	Long id;
//
//	@NotNull
//	@Column(nullable = false)
//	private String logradouro;
//
//	@NotNull
//	@Column(nullable = false)
//	private String bairro;
//
//	@NotNull
//	@Column(nullable = false)
//	private String cidade;
//
//	@NotNull
//	@Column(nullable = false, length = 2)
//	@Enumerated(EnumType.STRING)
//	private UF uf;
//
//	@NotNull
//	@Column(nullable = false, length = 9)
//	private String cep;
//
//	@NotNull
//	@Column(nullable = false, length = 5)
//	private Integer numero;
//
//	@NotNull
//	@Column(nullable = false)
//	private String complemento;
//
//	@NotNull
//	@Column(nullable = false)
//	private String telefone;
//
//}
