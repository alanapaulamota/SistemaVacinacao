package com.grad.sistemaVacinacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grad.sistemaVacinacao.model.DadosUsuario;
import com.grad.sistemaVacinacao.service.DadosUsuarioService;

@Controller
public class DadosUsuarioController {

	@Autowired
	private DadosUsuarioService dadoService;

	@GetMapping(value = "/dados")
	public ModelAndView dados() {
		ModelAndView modelAndView = new ModelAndView();
		DadosUsuario dados = new DadosUsuario();
//		modelAndView.addObject("dados", dados);
		modelAndView.setViewName("dados");
		return modelAndView;
	}

	@PostMapping(value = "/dados")
	public ModelAndView createDados(@Valid DadosUsuario dados, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		DadosUsuario dadosExists = dadoService.findDadosByid(dados.getId());
		if (dadosExists != null) {
			bindingResult.rejectValue("userName", "error.user",
					"Já existe um usuário registrado com o nome de usuário fornecido");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("dados");
		} else {
			dadoService.saveDados(dados);
			modelAndView.addObject("successMessage", "O usuário foi registrado com sucesso");
			modelAndView.addObject("dados", new DadosUsuario());
			modelAndView.setViewName("dados");

		}
		return modelAndView;
	}
}