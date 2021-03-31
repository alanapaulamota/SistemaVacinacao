package com.grad.SistemaVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grad.SistemaVacinacao.model.CadastroUser;
import com.grad.SistemaVacinacao.service.CadastroService;

/*
 * Bean gerenciado pelo Spring 
 */

@Controller // Define que minha classe será um controller
public class CadastroController {

	@Autowired
	CadastroService servico;

	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	// requisição GET -> transforma em action

	public String showUsuarioPage(ModelMap model) {

		model.addAttribute("cadastro", new CadastroUser());
		return "/cadastro";
	}

	@RequestMapping(value = "/saveUsuario", method = RequestMethod.POST)
	public String save(ModelMap model, CadastroUser cadastroUser, BindingResult result) {

		if (result.hasErrors()) {
			return "/login";
		}

		servico.save(cadastroUser);

		return "redirect:/cadastro";
	}

	@GetMapping({ "/", "/home" })
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping({ "/login" })
	public String login(Model model) {
		return "login";
	}

}
