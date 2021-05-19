package com.grad.sistemaVacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grad.sistemaVacinacao.model.LocalVacinacao;
import com.grad.sistemaVacinacao.service.LocalVacinacaoService;

@Controller
@RequestMapping("/localvacincao")
public class LocalVacinacaoController {

	private LocalVacinacaoService service;

	@GetMapping("/cadastrar")
	public String cadastrar(LocalVacinacao localVacinacao) {
		return "/admin/localVacinacao/cadastro";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("localVacinacao", service.findAll());
		return "/admin/localVacincao/lista";
	}

	@PostMapping("/salvar")
	public String salvar(LocalVacinacao localVacinacao) {
		service.salvar(localVacinacao);
		return "redirect:/admin/localVacinacao/cadastro";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("localVacinacao", service.findById(id));
		return "/admin/localVacinacao/cadastro";
	}

	@PostMapping("/editar")
	public String Editar(LocalVacinacao localVacinacao) {
		service.editar(localVacinacao);
		return "/admin/localVacinacao/cadastro";
	}
}
