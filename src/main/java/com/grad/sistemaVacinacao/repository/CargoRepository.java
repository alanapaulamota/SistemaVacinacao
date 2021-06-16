package com.grad.sistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grad.sistemaVacinacao.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}