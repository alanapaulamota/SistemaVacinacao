package com.grad.sistemaVacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/admin/cargo/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/admin/cargo/lista"; 
	}
}
