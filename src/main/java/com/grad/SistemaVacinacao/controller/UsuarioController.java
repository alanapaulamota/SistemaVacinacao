package com.grad.SistemaVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.grad.SistemaVacinacao.model.Usuario;
import com.grad.SistemaVacinacao.service.SecurityService;
import com.grad.SistemaVacinacao.service.UsuarioService;
import com.grad.SistemaVacinacao.validator.UsuarioValidator;

/*
 * Bean gerenciado pelo Spring 
 */


@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UsuarioValidator userValidator;

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("erro", "Usuario ou senha invalida.");

        if (logout != null)
            model.addAttribute("message", "Login Bem-Sucedido.");

        return "login";
    }

    
    
    @GetMapping("/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("userForm", new Usuario());

        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastro(@ModelAttribute("userForm") Usuario userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
			return "cadastro";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmaSenha());

        return "redirect:/home";
    }


    @GetMapping({"/", "/home"})
    public String home(Model model) {
        return "home";
    }
}

