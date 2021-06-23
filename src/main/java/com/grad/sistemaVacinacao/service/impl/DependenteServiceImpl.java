package com.grad.sistemaVacinacao.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.grad.sistemaVacinacao.model.Dependente;
import com.grad.sistemaVacinacao.repository.DependenteRepository;
import com.grad.sistemaVacinacao.service.DependenteService;

@Service
public class DependenteServiceImpl implements DependenteService {

	private DependenteRepository repositorio;

	public DependenteServiceImpl(DependenteRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public void cadastrar(@Valid Dependente dependente) {
		repositorio.save(dependente);
	}

	public List<Dependente> listarTodos() {
		return repositorio.findAll();
	}
}
