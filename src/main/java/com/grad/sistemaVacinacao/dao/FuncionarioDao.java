package com.grad.sistemaVacinacao.dao;

import java.util.List;

import com.grad.sistemaVacinacao.model.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();
	
}
