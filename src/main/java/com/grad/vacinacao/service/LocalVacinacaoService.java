package com.grad.vacinacao.service;

import com.grad.vacinacao.model.LocalVacinacao;

import java.util.List;

/**
 * Serviço para gerenciamento de
 * {@link com.grad.vacinacao.model.LocalVacinacao}.
 */
public interface LocalVacinacaoService {

	void salvar(LocalVacinacao localVacinacao);

	void editar(LocalVacinacao localVacinacao);

	void excluir(Long id);

	LocalVacinacao findById(Long id);

	List<LocalVacinacao> findAll();

}
