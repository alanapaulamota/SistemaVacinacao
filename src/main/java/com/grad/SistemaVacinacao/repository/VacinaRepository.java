package com.grad.SistemaVacinacao.repository;

import org.springframework.data.repository.CrudRepository;

import com.grad.SistemaVacinacao.model.Vacina;

public interface VacinaRepository extends CrudRepository<Vacina, String> {
	Vacina findById(long id);
}