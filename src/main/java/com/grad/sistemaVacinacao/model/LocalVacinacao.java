//package com.grad.sistemaVacinacao.model;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.grad.sistemaVacinacao.model.enumeration.TipoVacina;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;
//
///**
// * Classe model referente à local de vacinação, contém: atributos, equals e
// * hashcode.Além dos construtores e getters/setters gerados pelo lombok.
// * 
// */
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "localVacinacao")
//@Entity
//public class LocalVacinacao {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private Long id;
//
//	@Column(name = "nome")
//	private String nome;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "endereco_id_fk")
//	private Endereco endereco;
//
//	@Column(nullable = false)
//	@Enumerated(EnumType.STRING)
//	private TipoVacina tipoVacina;
//
//	@OneToMany(mappedBy = "localVacinacao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Cargo> cargos;
//
//}
