package com.grad.sistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grad.sistemaVacinacao.model.LocalVacinacao;

public interface LocalVacinacaoRepository extends JpaRepository<LocalVacinacao, Long> {

}