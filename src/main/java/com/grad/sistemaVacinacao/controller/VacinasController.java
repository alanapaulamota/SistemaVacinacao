package com.grad.sistemaVacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vacinas")
public class VacinasController {

		@GetMapping("/cadastrar")
		public String cadastrar() {
			return "/admin/vacina/cadastro";
		}
		
		@GetMapping("/listar")
		public String listar() {
			return "/admin/vacina/lista"; 
		}
	}
