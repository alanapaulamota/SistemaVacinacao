package com.grad.vacinacao.controller;

import com.grad.vacinacao.model.Funcionario;
import com.grad.vacinacao.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
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
 * {@link com.grad.vacinacao.model.Funcionario}.
 *
 */
@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService service;

	@PostMapping("/cadastrar")
	public String cadastrar() {
		return "/admin/funcionario/cadastro";

	}

	@GetMapping("/listar")
	public String listar() {
		return "/admin/funcionario/lista";

	}

	@PostMapping("/salvar")
	public String salvar(Funcionario funcionario) {
		service.salvar(funcionario);
		return "redirect:/admin/funcionario/cadastro";
	}

	@PatchMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("localVacinacao", service.findById(id));
		return "/admin/funcionario/cadastro";
	}

	@PutMapping("/editar")
	public String Editar(Funcionario funcionario) {
		service.editar(funcionario);
		return "/admin/funcionario/cadastro";
	}
	
	@DeleteMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("funcionario", service.findById(id));
		return "/admin/funcionario/cadastro";
	}
}