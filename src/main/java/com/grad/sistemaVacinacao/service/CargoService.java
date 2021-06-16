
package com.grad.sistemaVacinacao.service;

import java.util.List;

import javax.validation.Valid;

import com.grad.sistemaVacinacao.model.Cargo;

/**
 * Serviço para gerenciamento de
 * {@link com.grad.sistemaVacinacao.model.Cargo}.
 */
public interface CargoService {
	public void cadastrar(@Valid Cargo cargo);

	public List<Cargo> listarTodos();
}
