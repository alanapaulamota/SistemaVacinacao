package com.grad.sistemaVacinacao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vacinasAdministradas")
public class VacinasAdministradasController {

		@GetMapping("/cadastrar")
		public String cadastrar() {
			return "/admin/vacinaAdministrada/cadastro";
		}
		
		@GetMapping("/listar")
		public String listar() {
			return "/admin/vacinaAdministrada/lista"; 
		}
	}
