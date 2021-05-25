package com.grad.sistemaVacinacao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grad.sistemaVacinacao.model.ConfirmationToken;

/**
 * Repositório para gerenciamento de
 * {@link com.grad.sistemaVacinacao.model.ConfirmationToken}.
 */
@Repository
public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	/**
	 * Método que busca a confirmação de token
	 * @param confirmationToken A confirmação do token
	 * @return Retorna a confirmação do token
	 */
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}
