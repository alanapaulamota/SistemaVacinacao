package com.grad.sistemaVacinacao.service;

import org.springframework.stereotype.Service;

import com.grad.sistemaVacinacao.model.DadosUsuario;
import com.grad.sistemaVacinacao.repository.DadosRepository;

@Service
public class DadosUsuarioService {

	private DadosRepository dadosRepository;

	public DadosUsuario findDadosByid(Integer id) {
		return dadosRepository.findbyId(id);
	}

	public DadosUsuario saveDados(DadosUsuario dados) {
		return dadosRepository.salvar(dados);
	}
}