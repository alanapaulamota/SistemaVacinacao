package com.grad.sistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grad.sistemaVacinacao.model.Funcionario;

public  interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
