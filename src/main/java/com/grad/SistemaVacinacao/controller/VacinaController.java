package com.grad.SistemaVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.grad.SistemaVacinacao.model.Vacina;
import com.grad.SistemaVacinacao.repository.VacinaRepository;

@Controller
public class VacinaController {

	@Autowired
	private VacinaRepository vacinarepo;

	@RequestMapping(value = "/cadastroVacina", method = RequestMethod.GET)
	public String form() {
		return "cadastroVacina";
	}

	@RequestMapping(value = "/cadastroVacina", method = RequestMethod.POST)
	public String form(Vacina vacina) {
		vacinarepo.save(vacina);
		return "redirect/cadastroVacina";
	}

	@RequestMapping("/vacinas")
	public ModelAndView listaVacinas() {
		ModelAndView mv = new ModelAndView("listaVacinas");
		Iterable<Vacina> vacinas = vacinarepo.findAll();
		mv.addObject("vacinas", vacinas);
		return mv;
	}
}
