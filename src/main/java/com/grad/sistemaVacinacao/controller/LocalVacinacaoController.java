package com.grad.sistemaVacinacao.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grad.sistemaVacinacao.model.LocalVacinacao;
import com.grad.sistemaVacinacao.service.LocalVacinacaoService;

@Controller
@RequestMapping("/departamentos")
public class LocalVacinacaoController {

	private LocalVacinacaoService servico;

	public LocalVacinacaoController(LocalVacinacaoService servico) {
		this.servico = servico;
	}

	@GetMapping("/cadastrar")
	public String cadastrar() {
		// TODO carregar dados
		return "/admin/departamento/cadastro";
	}

	@PostMapping("/cadastrar")
	public String salvar(@Valid @ModelAttribute("localVacinacao") LocalVacinacao localVacinacao, BindingResult result,
			ModelMap model) {

		System.err.println("entrou ..." + localVacinacao);

		servico.cadastrar(localVacinacao);

		System.err.println("cadastrou ...");
		servico.listarTodos().forEach(System.err::println);

		return "/admin/departamento/cadastro";
	}

	@GetMapping("/listar")
	public String listar() {
		return "/admin/departamento/lista";
	}
}
