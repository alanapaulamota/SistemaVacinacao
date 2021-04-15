package com.grad.SistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grad.SistemaVacinacao.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}
