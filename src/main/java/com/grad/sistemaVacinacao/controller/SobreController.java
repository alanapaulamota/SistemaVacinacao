package com.grad.sistemaVacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SobreController {

	@GetMapping(value = { "/sobre" })
	public ModelAndView sobre() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("sobre");
		return modelAndView;
	}
}
