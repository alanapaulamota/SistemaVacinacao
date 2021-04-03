package com.grad.SistemaVacinacao.service;

import java.util.List;

import com.grad.SistemaVacinacao.model.Usuario;

public interface UsuarioService {

	void save(Usuario user);

	Usuario findByUsername(String username);
}