package com.grad.sistemaVacinacao.service;

import java.util.List;

import com.grad.sistemaVacinacao.model.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);

	void editar(Cargo cargo);

	void excluir(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
