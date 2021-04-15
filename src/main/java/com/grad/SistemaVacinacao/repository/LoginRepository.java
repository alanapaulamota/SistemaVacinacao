package com.grad.SistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grad.SistemaVacinacao.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {


}
