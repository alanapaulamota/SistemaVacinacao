package com.grad.sistemaVacinacao.service;


import java.util.List;

import javax.validation.Valid;

import com.grad.sistemaVacinacao.model.LocalVacinacao;

/**
 * Serviço para gerenciamento de
 * {@link com.grad.sistemaVacinacao.model.LocalVacinacao}.
 */
public interface LocalVacinacaoService {
	public void cadastrar(@Valid LocalVacinacao localVacinacao);

	public List<LocalVacinacao> listarTodos();
}
