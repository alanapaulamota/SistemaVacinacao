package com.grad.sistemaVacinacao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe model referente à vacina contém: atributos, equals e hashcode.Além dos
 * construtores e getters/setters gerados pelo lombok.
 * 
 */
@Data
//@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vacina")
public class Vacina implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column(name = "fabricante")
    private String fabricante;

    @NotNull
    @Column(name = "tipo")
    private String tipo;

    @NotNull
    @Column(name = "fornecedor")
    private String fornecedor;

//	@ManyToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "id_estoque_vacina")
//	private Vacina vacina;

//	@ManyToMany(cascade = CascadeType.MERGE)
//	@JoinTable(name = "estoque_vacina", joinColumns = @JoinColumn(name = "vacina_id"), inverseJoinColumns = @JoinColumn(name = "estoque_vacina_id"))
//	private Set<EstoqueVacina> estoqueVacinas;

}
