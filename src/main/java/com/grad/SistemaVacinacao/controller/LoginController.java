package com.grad.SistemaVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grad.SistemaVacinacao.model.Login;
import com.grad.SistemaVacinacao.service.LoginService;

@Controller // Define que minha classe será um controller
public class LoginController {

	// Ponto de injeção para conseguir usar os metodos implementados no LoginService
	@Autowired
	LoginService servico;

	@RequestMapping(value = "/indexLogin", method = RequestMethod.GET) // anotação responsável pelo processamento da URL
																		// mapeada -> transforma em action

	public String showLoginPage(ModelMap model) { // Model é um auxiliar que ajuda a adicionar atributos a nossa view,
		// o ModelMap é uma extensao do Model com capacidade de armazenar
		// atributos em um mapa e em chamadas de método em cadeia.

		model.addAttribute("indexLogin", new Login()); // adicionando atributos a view
		return "indexLogin"; // Retorna a view (indexLogin.jsp) que deve ser chamada (.jsp é omitido)
	}

}
