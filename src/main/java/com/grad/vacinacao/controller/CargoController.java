package com.grad.vacinacao.controller;

import com.grad.vacinacao.model.Cargo;
import com.grad.vacinacao.service.CargoService;

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
 * {@link com.grad.vacinacao.model.Cargo}.
 *
 */
@Controller
@RequestMapping("/cargo")
public class CargoController {

	@Autowired
	private CargoService service;

	@PostMapping("/cadastrar")
	public String cadastrar() {
		return "/admin/cargo/cadastro";

	}

	@GetMapping("/listar")
	public String listar() {
		return "/admin/cargo/lista";

	}

	@PostMapping("/salvar")
	public String salvar(Cargo cargo) {
		service.salvar(cargo);
		return "redirect:/admin/cargo/cadastro";
	}

	@PatchMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("localVacinacao", service.findById(id));
		return "/admin/cargo/cadastro";
	}

	@PutMapping("/editar")
	public String Editar(Cargo cargo) {
		service.editar(cargo);
		return "/admin/cargo/cadastro";
	}
	
	@DeleteMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("cargo", service.findById(id));
		return "/admin/cargo/cadastro";
	}
}
