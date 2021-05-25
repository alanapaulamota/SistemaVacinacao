package com.grad.sistemaVacinacao.service;


import java.io.Serializable;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.grad.sistemaVacinacao.dao.AbstractDAO;
import com.grad.sistemaVacinacao.dao.DAO;
import com.grad.sistemaVacinacao.model.Entidade;

/**
 * Interface que representa um serviço associado a uma entidade
 * 
 * @param <E> Entidade que será tratada pelo serviço
 * @param <D> Data Transfer Object com os dados da entidade <E> que serão
 *              transferidos.
 * @param <T> Classe serializável que representa o T da entidade <E> e do
 *              <D> associado.
 *              
 * @see Entidade
 * @see DAO
 */
public interface Servico<E extends Entidade<T>, D extends AbstractDAO<T>, T extends Serializable> {

	/**
	 * Salva (cria) a entidade.
	 *
	 * @param dto a entidade a ser criada.
	 * @return a entidade persistida.
	 */
	public D save(@Valid D dto);

	/**
	 * Salva (atualiza) a entidade.
	 *
	 * @param dto a entidade a ser atualizada.
	 * @return a entidade persistida.
	 */
	public D update(@Valid D dto);

	/**
	 * Retorna todas as entidades de acordo com as informações de paginação.
	 *
	 * @param pageable informações de paginação.
	 * @return a lista de entidades.
	 */
	public Page<D> findAll(Pageable pageable);

	/**
	 * Encontra uma entidade pelo seu identificador.
	 *
	 * @param id o identificador da entidade
	 * @return a entidade.
	 */
	public Optional<D> findById(T id);

	/**
	 * Exclui uma entidade pelo seu identificador.
	 *
	 * @param id o identificador da entidade.
	 */
	public void delete(T id);

	/**
	 * Exclui uma entidade.
	 * 
	 * @param entity entidade a ser excluída
	 */
	public void delete(E entity);
}
