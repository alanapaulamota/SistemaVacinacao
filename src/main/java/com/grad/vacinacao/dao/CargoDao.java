package com.grad.vacinacao.dao;

import com.grad.vacinacao.model.Cargo;

import java.util.List;

/**
 * O DAO para a entidade
 * {@link package com.grad.vacinacao.model.Cargo}.
 * 
 */
public interface CargoDao {

	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
