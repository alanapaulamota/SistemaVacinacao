package com.grad.sistemaVacinacao.service;

import java.util.List;

import javax.validation.Valid;

import com.grad.sistemaVacinacao.model.Funcionario;

//package com.grad.sistemaVacinacao.service;
//
//import java.util.List;
//
//import com.grad.sistemaVacinacao.model.Funcionario;
//
/**
 * Serviço para gerenciamento de
 * {@link com.grad.sistemaVacinacao.model.Funcionario}.
 */
public interface FuncionarioService {

	public void cadastrar(@Valid Funcionario funcionario);

	public List<Funcionario> listarTodos();
//
}
