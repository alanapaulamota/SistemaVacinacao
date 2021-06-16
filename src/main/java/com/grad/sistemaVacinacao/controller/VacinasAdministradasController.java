package com.grad.sistemaVacinacao.controller;

import com.grad.sistemaVacinacao.model.ItemCarteiraVacinacao;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacinasAdministradas")
public class VacinasAdministradasController {

    @GetMapping("/cadastrar")
    public String cadastrar(Model model) {
        // return "/admin/vacinaAdministrada/cadastro";
        
        model.addAttribute("teste", "HELLO");
        
        return "/admin/vacinaAdministrada/novo";
    }

    @PostMapping("/cadastrar")
    public String salvar(@Valid @ModelAttribute("item") ItemCarteiraVacinacao item, BindingResult result, ModelMap model) {
        
        System.err.println("entrou: "+item);
        
        return "/admin/vacinaAdministrada/novo";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/admin/vacinaAdministrada/lista";
    }
}
