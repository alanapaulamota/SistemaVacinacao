package com.grad.sistemaVacinacao.service;

import java.util.List;

import com.grad.sistemaVacinacao.model.LocalVacinacao;

public interface LocalVacinacaoService {

	void salvar(LocalVacinacao localVacinacao);

	void editar(LocalVacinacao localVacinacao);

	void excluir(Long id);

	LocalVacinacao findById(Long id);

	List<LocalVacinacao> findAll();

}
