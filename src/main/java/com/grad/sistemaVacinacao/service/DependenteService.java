package com.grad.sistemaVacinacao.service;

import java.util.List;

import javax.validation.Valid;

import com.grad.sistemaVacinacao.model.Dependente;

public interface DependenteService {

	public void cadastrar(@Valid Dependente dependente);

	public List<Dependente> listarTodos();

}
