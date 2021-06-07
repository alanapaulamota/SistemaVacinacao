package com.grad.vacinacao.dao;

import com.grad.vacinacao.model.Funcionario;

import java.util.List;

/**
 * O DAO para a entidade
 * {@link package com.grad.vacinacao.model.Funcionario}.
 * 
 */
public interface FuncionarioDao {

	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();
	
}
