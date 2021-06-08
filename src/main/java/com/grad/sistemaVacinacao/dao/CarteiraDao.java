package com.grad.sistemaVacinacao.dao;

import java.util.List;

import com.grad.sistemaVacinacao.model.CarteiraVacinacao;

public interface CarteiraDao {
	void save(CarteiraVacinacao carteira);

	void update(CarteiraVacinacao carteira);

	void delete(Long id);

	CarteiraVacinacao findById(Long id);

	List<CarteiraVacinacao> findAll();
}
