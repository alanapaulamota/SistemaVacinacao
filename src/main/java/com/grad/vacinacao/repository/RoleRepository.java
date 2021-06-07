package com.grad.vacinacao.repository;

import com.grad.vacinacao.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para gerenciamento de
 * {@link com.grad.vacinacao.model.Role}.
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
