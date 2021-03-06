package com.grad.sistemaVacinacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grad.sistemaVacinacao.model.User;
import com.grad.sistemaVacinacao.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping(value = { "/", "/login" })
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@GetMapping(value = "/registration")
	public ModelAndView registration() {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("registration");
		return modelAndView;
	}

	@PostMapping(value = "/registration")
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByUserName(user.getUserName());
		if (userExists != null) {
			bindingResult.rejectValue("userName", "error.user",
					"Já existe um usuário registrado com o nome de usuário fornecido");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("registration");
		} else {
			userService.saveUser(user);
			modelAndView.addObject("successMessage", "O usuário foi registrado com sucesso");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("registration");

		}
		return modelAndView;
	}

	@GetMapping(value = "/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByUserName(auth.getName());
		modelAndView.addObject("userName", "Bem-Vindo " + user.getUserName() + "/" + user.getName() + " "
				+ user.getLastName() + " (" + user.getEmail() + ")");
		modelAndView.setViewName("/home");
		return modelAndView;
	}

//	@GetMapping(value = "/admin/home")
//	public ModelAndView homeAdmin() {
//		ModelAndView modelAndView = new ModelAndView();
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByUserName(auth.getName());
//		modelAndView.addObject("userName", "Bem-Vindo " + user.getUserName() + "/" + user.getName() + " "
//				+ user.getLastName() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage", "Conteúdo disponível apenas para usuários com função administrativa");
//		modelAndView.setViewName("admin/home");
//		return modelAndView;
//	}


	
	@GetMapping("/admin/homeAdmin")
	public String homeAdmin() {
		return "/admin/homeAdmin";
	}
	
}