package com.grad.sistemaVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grad.sistemaVacinacao.model.Cargo;
import com.grad.sistemaVacinacao.service.CargoService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private CargoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/admin/funcionario/cadastro";

	}

	@GetMapping("/listar")
	public String listar() {
		return "/admin/funcionario/lista";

	}
	
	@PostMapping("/salvar")
	public String salvar(Cargo cargo) {
		service.salvar(cargo);
		return "redirect:/admin/cargo/cadastro";
	}
		@GetMapping("/editar/{id}")
		public String preEditar(@PathVariable("id") Long id, ModelMap model) {
			model.addAttribute("localVacinacao", service.findById(id));
			return "/admin/cargo/cadastro";
		}

		@PostMapping("/editar")
		public String Editar(Cargo cargo) {
			service.editar(cargo);
			return "/admin/cargo/cadastro";
		}
}