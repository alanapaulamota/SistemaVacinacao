package com.grad.vacinacao.dao;

import com.grad.vacinacao.model.LocalVacinacao;

import java.util.List;

/**
 * O DAO para a entidade {@link package
 * com.grad.vacinacao.model.LocalVacinacao}.
 * 
 */
public interface LocalVacinacaoDao {

	void save(LocalVacinacao localvacinacao);

	void update(LocalVacinacao localvacinacao);

	void delete(Long id);

	LocalVacinacao findById(Long id);

	List<LocalVacinacao> findAll();

}
