package com.grad.vacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO alterar URL das paginas administrativas
 * Classe controller referente à Tela "Sobre".
 *
 */
@Controller
public class SobreController {

	@GetMapping(value = { "/sobre" })
	public ModelAndView sobre() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("sobre");
		return modelAndView;
	}
}
