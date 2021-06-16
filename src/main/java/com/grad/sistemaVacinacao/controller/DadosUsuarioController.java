package com.grad.sistemaVacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DadosUsuarioController {

	@GetMapping(value = { "/AltDados" })
	public ModelAndView dados() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("AltDados");
		return modelAndView;
	}
}
