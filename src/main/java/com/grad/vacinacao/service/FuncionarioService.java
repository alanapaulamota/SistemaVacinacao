package com.grad.vacinacao.service;

import com.grad.vacinacao.model.Funcionario;

import java.util.List;

/**
 * Serviço para gerenciamento de
 * {@link com.grad.vacinacao.model.Funcionario}.
 */
public interface FuncionarioService {

	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void excluir(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();

}
