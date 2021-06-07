package com.grad.vacinacao.service.impl;

import com.grad.vacinacao.dao.FuncionarioDao;
import com.grad.vacinacao.model.Funcionario;
import com.grad.vacinacao.service.FuncionarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementação de Serviço para gerenciamento de {@link Funcionario}.
 */
@Transactional(readOnly = false)
@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;

	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);

	}

	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Transactional(readOnly = true)
	@Override
	public Funcionario findById(Long id) {
		return dao.findById(id);

	}

	@Transactional(readOnly = true)
	@Override
	public List<Funcionario> findAll() {
		return dao.findAll();

	}
}
