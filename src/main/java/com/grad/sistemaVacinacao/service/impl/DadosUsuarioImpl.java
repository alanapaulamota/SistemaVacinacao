package com.grad.sistemaVacinacao.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.grad.sistemaVacinacao.model.DadosUsuario;
import com.grad.sistemaVacinacao.repository.DadosUsuarioRepository;
import com.grad.sistemaVacinacao.service.DadosUsuarioService;

@Service
public class DadosUsuarioImpl implements DadosUsuarioService {

	private DadosUsuarioRepository repositorio;

	public DadosUsuarioImpl(DadosUsuarioRepository repositorio) {
        this.repositorio = repositorio;
    }

	@Override
	public void cadastrar(@Valid DadosUsuario dadosUsuario) {
		repositorio.save(dadosUsuario);
	}

	public List<DadosUsuario> listarTodos() {
		return repositorio.findAll();
	}
}
