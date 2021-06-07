package com.grad.vacinacao.dao;

import java.io.Serializable;

/**
 * Representa um DAO
 * 
 *
 * @param <T> tipo do identificador
 */
public interface DAO<T extends Serializable> extends Serializable {
	
	/**
	 * Retorna o atributo id.
	 * 
	 * @return Retorna o atributo id.
	 */
	public T getId();
	
	/**
	 * Define o valor do atributo id.
	 * 
	 * @param id o valor do atributo id
	 */
	public void setId(T id);
	
}
