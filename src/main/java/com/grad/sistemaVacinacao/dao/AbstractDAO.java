package com.grad.sistemaVacinacao.dao;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class AbstractDAO<T extends Serializable> extends RepresentationModel<AbstractDAO<Serializable>> implements DAO<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public T getId() {
		return null;
	}

	@Override
	public void setId(T id) {
		
	}

}
