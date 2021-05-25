package com.grad.sistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grad.sistemaVacinacao.model.Role;

/**
 * Repositório para gerenciamento de
 * {@link com.grad.sistemaVacinacao.model.Role}.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	/**
	 * Método que busca a Role.
	 * 
	 * @param role A role
	 * @return Retorna a Role.
	 */
	Role findByRole(String role);

}
