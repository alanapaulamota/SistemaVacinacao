package com.grad.sistemaVacinacao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Classe model referente ao Item Carteira de Vacinação, contém: atributos,
 * equals e hashcode.Além dos construtores e getters/setters gerados pelo
 * lombok.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item_carteira")
public class ItemCarteiraVacinacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    
    //@ManyToOne
    //private Vacina vacina;
    private String vacina;
    
    @ManyToOne
    private Funcionario funcionario;
    
    @ManyToOne
    private LocalVacinacao localVacinacao;
    
    @ManyToOne
    private User user;
    
    @ManyToOne
//    @JoinColumn(name = "id", nullable = false)
    private CarteiraVacinacao carteira;

    @NotNull
    private String observacao;
    
    private Date data;

}
