package com.grad.vacinacao.service;

import com.grad.vacinacao.model.Cargo;

import java.util.List;

/**
 * Serviço para gerenciamento de
 * {@link com.grad.vacinacao.model.Cargo}.
 */
public interface CargoService {

	void salvar(Cargo cargo);

	void editar(Cargo cargo);

	void excluir(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
