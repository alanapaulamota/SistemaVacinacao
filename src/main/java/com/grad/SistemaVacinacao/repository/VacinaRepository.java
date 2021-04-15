package com.grad.SistemaVacinacao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grad.SistemaVacinacao.model.Vacina;

@Repository
public interface VacinaRepository extends CrudRepository<Vacina, String> {
	List<Vacina> findById(long id);
}