package com.grad.sistemaVacinacao.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class homeAdmin {
	@GetMapping("/admin/homeAdmin")
	public String home() {
		return "/admin/homeAdmin";
	}
}