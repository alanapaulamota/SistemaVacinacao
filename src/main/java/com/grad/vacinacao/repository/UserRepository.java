package com.grad.vacinacao.repository;

import com.grad.vacinacao.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para gerenciamento de
 * {@link com.grad.vacinacao.model.User}.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * Método que busca o usuário a partir do e-mail passado.
	 * 
	 * @param email O email
	 * @return Retorna usuário pelo email.
	 */
	User findByEmail(String email);

	/**
	 * Método que busca o usuário a partir do userName(apelido) passado.
	 * 
	 * @param email O email
	 * @return Retorna usuário pelo userName.
	 */
	User findByApelido(String userName);
}