package com.grad.sistemaVacinacao.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.grad.sistemaVacinacao.model.LocalVacinacao;
import com.grad.sistemaVacinacao.repository.LocalVacinacaoRepository;
import com.grad.sistemaVacinacao.service.LocalVacinacaoService;

@Service
public class LocalVacinacaoServiceImpl implements LocalVacinacaoService {

	private LocalVacinacaoRepository repositorio;

	public LocalVacinacaoServiceImpl(LocalVacinacaoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public void cadastrar(@Valid LocalVacinacao LocalVacinacao) {
		repositorio.save(LocalVacinacao);
	}

	public List<LocalVacinacao> listarTodos() {
		return repositorio.findAll();
	}
}
