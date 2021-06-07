package com.grad.vacinacao.controller;

import com.grad.vacinacao.model.LocalVacinacao;
import com.grad.vacinacao.service.LocalVacinacaoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * TODO alterar URL das paginas administrativas
 * Classe controller referente à
 * {@link com.grad.vacinacao.model.LocalVacinacao}.
 *
 */
@Controller
@RequestMapping("/localvacinacao")
public class LocalVacinacaoController {

	private LocalVacinacaoService service;

	@PostMapping("/cadastrar")
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

	@PatchMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("localVacinacao", service.findById(id));
		return "/admin/localVacinacao/cadastro";
	}

	@PutMapping("/editar")
	public String Editar(LocalVacinacao localVacinacao) {
		service.editar(localVacinacao);
		return "/admin/localVacinacao/cadastro";
	}
	
	
	@DeleteMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("localVacinacao", service.findById(id));
		return "/admin/localVacinacao/cadastro";
	}
}
