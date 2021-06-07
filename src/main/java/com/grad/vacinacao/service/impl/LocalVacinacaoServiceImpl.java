package com.grad.vacinacao.service.impl;

import com.grad.vacinacao.dao.LocalVacinacaoDao;
import com.grad.vacinacao.model.LocalVacinacao;
import com.grad.vacinacao.service.LocalVacinacaoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementação de Serviço para gerenciamento de {@link LocalVacinacao}.
 */
@Transactional(readOnly = false)
@Service
public class LocalVacinacaoServiceImpl implements LocalVacinacaoService {

	@Autowired
	private LocalVacinacaoDao dao;

	@Override
	public void salvar(LocalVacinacao localVacinacao) {
		dao.save(localVacinacao);

	}

	@Override
	public void editar(LocalVacinacao localVacinacao) {
		dao.update(localVacinacao);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Transactional(readOnly = true)
	@Override
	public LocalVacinacao findById(Long id) {
		return dao.findById(id);

	}

	@Transactional(readOnly = true)
	@Override
	public List<LocalVacinacao> findAll() {
		return dao.findAll();

	}

}
