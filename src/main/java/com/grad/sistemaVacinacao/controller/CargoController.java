package com.grad.sistemaVacinacao.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grad.sistemaVacinacao.model.Cargo;
import com.grad.sistemaVacinacao.service.CargoService;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	private CargoService servico;

	public CargoController(CargoService servico) {
		this.servico = servico;
	}

	@GetMapping("/cadastrar")
	public String cadastrar() {
		// TODO carregar dados
		return "/admin/cargo/cadastro";
	}

	@PostMapping("/cadastrar")
	public String salvar(@Valid @ModelAttribute("cargo") Cargo cargo, BindingResult result, ModelMap model) {

		System.err.println("entrou ..." + cargo);

		servico.cadastrar(cargo);

		System.err.println("cadastrou ...");
		servico.listarTodos().forEach(System.err::println);

		return "/admin/cargo/cadastro";
	}

	@GetMapping("/listar")
	public String listar() {
		return "/admin/cargo/lista";
	}
}
