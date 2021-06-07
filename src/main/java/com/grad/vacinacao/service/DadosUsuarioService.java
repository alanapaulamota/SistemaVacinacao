package com.grad.vacinacao.service;

import com.grad.vacinacao.model.DadosUsuario;
import com.grad.vacinacao.repository.DadosRepository;

import org.springframework.stereotype.Service;

@Service
public class DadosUsuarioService {

	private DadosRepository dadosRepository;

	public DadosUsuario findDadosByid(Integer id) {
		return dadosRepository.findById(id);
	}

	public DadosUsuario saveDados(DadosUsuario dados) {
		return dadosRepository.save(dados);
	}
}