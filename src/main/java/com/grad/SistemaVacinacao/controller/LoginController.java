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

	@Autowired
	LoginService servico;

	@RequestMapping(value = "/indexLogin", method = RequestMethod.GET)

	public String showLoginPage(ModelMap model) {
		model.addAttribute("indexLogin", new Login());
		return "indexLogin";
	}

}
