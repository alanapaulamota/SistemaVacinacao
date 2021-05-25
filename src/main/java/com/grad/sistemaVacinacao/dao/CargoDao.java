package com.grad.sistemaVacinacao.dao;

import java.util.List;

import com.grad.sistemaVacinacao.model.Cargo;

/**
 * O DAO para a entidade
 * {@link package com.grad.sistemaVacinacao.model.Cargo}.
 * 
 */
public interface CargoDao {

	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
