package com.grad.sistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grad.sistemaVacinacao.model.Dependente;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {

}
