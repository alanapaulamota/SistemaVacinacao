package com.grad.sistemaVacinacao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.grad.sistemaVacinacao.model.enumeration.TipoVacina;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe model referente ao estoque de vacina, contém: atributos, equals e
 * hashcode.Além dos construtores e getters/setters gerados pelo lombok.
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estoque_vacina")
public class EstoqueVacina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estoque_vacina")
	private Long id;

	@NotNull
	@Column(name = "nome")
	private String nome;

	@NotNull
	@Column(name = "quantidade")
	private String quantidade;

	@NotNull
	@Column(name = "fornecedor")
	private String fornecedor;

	@NotNull
	@Column(name = "marca")
	private String marca;

	@NotNull
	@Column(name = "preco_compra")
	private String precoCompra;

	@NotNull
	@Column(name = "preco_venda")
	private String precoVenda;

	@NotNull
	@Column(name = "data")
	private Date data;

	@NotNull
	@Column(name = "fabricante")
	private String fabricante;

	@NotNull
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoVacina tipoVacina;

	@OneToMany(mappedBy = "estoque_vacina")
	private List<Vacina> vacinas;

}