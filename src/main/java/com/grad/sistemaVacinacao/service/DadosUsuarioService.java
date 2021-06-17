package com.grad.sistemaVacinacao.service;

import java.util.List;

import javax.validation.Valid;

import com.grad.sistemaVacinacao.model.DadosUsuario;

public interface DadosUsuarioService {

	public void cadastrar(@Valid DadosUsuario dadosUsuario);

	public List<DadosUsuario> listarTodos();
}