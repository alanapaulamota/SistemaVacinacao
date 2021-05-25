package com.grad.sistemaVacinacao.dao;

import java.util.List;

import com.grad.sistemaVacinacao.model.LocalVacinacao;

/**
 * O DAO para a entidade {@link package
 * com.grad.sistemaVacinacao.model.LocalVacinacao}.
 * 
 */
public interface LocalVacinacaoDao {

	void save(LocalVacinacao localvacinacao);

	void update(LocalVacinacao localvacinacao);

	void delete(Long id);

	LocalVacinacao findById(Long id);

	List<LocalVacinacao> findAll();

}
