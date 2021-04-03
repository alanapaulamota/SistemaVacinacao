package com.grad.SistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grad.SistemaVacinacao.model.Usuario;

	public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	    Usuario findByUsername(String username);
	}
