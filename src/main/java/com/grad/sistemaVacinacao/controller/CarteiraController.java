package com.grad.sistemaVacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Classe controller referente à
 * {@link com.grad.sistemaVacinacao.model.CarteiraVacinacao} e  {@link com.grad.sistemaVacinacao.model.CarteiraVacinacaoDependente}.
 *
 */
@Controller
public class CarteiraController {

	@GetMapping(value = { "/carteira" })
	public ModelAndView carteira() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("carteira");
		return modelAndView;
	}

	@GetMapping(value = { "/carteirainfantil" })
	public ModelAndView carteirainfantil() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("carteirainfantil");
		return modelAndView;
	}

}