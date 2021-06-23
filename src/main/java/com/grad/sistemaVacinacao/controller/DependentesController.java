package com.grad.sistemaVacinacao.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grad.sistemaVacinacao.model.Dependente;
import com.grad.sistemaVacinacao.service.DependenteService;

@Controller
@RequestMapping("/dependentes")
public class DependentesController {

	private DependenteService servico;

	public DependentesController(DependenteService servico) {
	        this.servico = servico;
	    }

	@GetMapping("/cadastrar")
	public String cadastrar() {
		// TODO carregar dados
		return "/cadastroDependente";
	}

	@PostMapping("/cadastrar")
	public String salvar(@Valid @ModelAttribute("dependente") Dependente dependente, BindingResult result, ModelMap model) {

		System.err.println("entrou ..." + dependente);

		servico.cadastrar(dependente);

		System.err.println("cadastrou ...");
		servico.listarTodos().forEach(System.err::println);

		return "/cadastroDependente";
	}

}