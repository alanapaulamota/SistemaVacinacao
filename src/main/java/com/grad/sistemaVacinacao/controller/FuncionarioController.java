package com.grad.sistemaVacinacao.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grad.sistemaVacinacao.model.Funcionario;
import com.grad.sistemaVacinacao.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	private FuncionarioService servico;

	public FuncionarioController(FuncionarioService servico) {
	        this.servico = servico;
	    }
	@GetMapping("/cadastrar")	
	public String cadastrar() {
		// TODO carregar dados
		return "/admin/funcionario/cadastro";
	}

	@PostMapping("/cadastrar")
	public String salvar(@Valid @ModelAttribute("funcionario") Funcionario funcionario, BindingResult result,
			ModelMap model) {

		System.err.println("entrou ..." + funcionario);

		servico.cadastrar(funcionario);

		System.err.println("cadastrou ...");
		servico.listarTodos().forEach(System.err::println);

		return "/admin/funcionario/cadastro";
	}

	@GetMapping("/listar")
	public String listar() {
		return "/admin/funcionario/lista";
	}
}
