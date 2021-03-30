package com.grad.SistemaVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	@RequestMapping(value = "/Cadastro", method = RequestMethod.GET)
	// requisição GET -> transforma em action

	public String showUsuarioPage(ModelMap model) {

		model.addAttribute("Cadastro", new CadastroUser()); // adicionando atributos a view
		return "/Cadastro"; // Retorna a view (Cadastro.html) que deve ser chamada (.jsp é omitido)
	}

	@RequestMapping(value = "/saveUsuario", method = RequestMethod.POST) // mapeamento da URL, requisição POST
	public String save(ModelMap model, CadastroUser cadastroUser, BindingResult result) { // BindingResult auxilia na
																							// validação
		// durante o processo de binding, caso
		// haja algum erro,é redirecionado pra
		// pagina indicada
		if (result.hasErrors()) {
			return "/indexLogin"; // Retorna a view (Cadastro.jsp) que deve ser chamada (.jsp é omitido)
		}

		servico.save(cadastroUser); // chama a classe de servico e salva o usuario cadastrado

		return "redirect:/Cadastro"; // Faz redirecionamento da tela de cadastro pra tela de login (.jsp é omitido)
	}

}
