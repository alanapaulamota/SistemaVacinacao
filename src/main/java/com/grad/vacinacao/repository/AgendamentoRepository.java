package com.grad.vacinacao.repository;

import com.grad.vacinacao.model.Agendamento;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Repository;

/**
 * Repositório para gerenciamento de
 * {@link com.grad.vacinacao.model.Agendamento}.
 */
@Repository
public interface AgendamentoRepository extends CrudRepository<Agendamento, Long> {
	@Query("from Agendamento e where not(e.end < :from or e.start > :to)")
	public List<Agendamento> findBetween(@Param("from") @DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime start, @Param("to") @DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime end);
}