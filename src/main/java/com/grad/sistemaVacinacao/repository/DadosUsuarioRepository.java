package com.grad.sistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grad.sistemaVacinacao.model.DadosUsuario;

public interface DadosUsuarioRepository extends JpaRepository<DadosUsuario, Long> {

}
