package com.grad.sistemaVacinacao.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.grad.sistemaVacinacao.model.Agendamento;

public interface AgendamentoRepository extends CrudRepository<Agendamento, Long> {
	@Query("from Agendamento e where not(e.end < :from or e.start > :to)")
	public List<Agendamento> findBetween(@Param("from") @DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime start, @Param("to") @DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime end);
}