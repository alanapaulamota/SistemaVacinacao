package com.grad.SistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grad.SistemaVacinacao.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
