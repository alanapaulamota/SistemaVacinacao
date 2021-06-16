package com.grad.sistemaVacinacao.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.grad.sistemaVacinacao.model.Funcionario;
import com.grad.sistemaVacinacao.repository.FuncionarioRepository;
import com.grad.sistemaVacinacao.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	private FuncionarioRepository repositorio;

	public FuncionarioServiceImpl(FuncionarioRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public void cadastrar(@Valid Funcionario funcionario) {
		repositorio.save(funcionario);
	}

	public List<Funcionario> listarTodos() {
		return repositorio.findAll();
	}
}
