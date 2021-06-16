package com.grad.sistemaVacinacao.controller;

import com.grad.sistemaVacinacao.model.Vacina;
import com.grad.sistemaVacinacao.service.VacinaService;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacinas")
public class VacinasController {

    private VacinaService servico;

    public VacinasController(VacinaService servico) {
        this.servico = servico;
    }

    @GetMapping("/cadastrar")
    public String cadastrar() {
        //TODO carregar dados
        return "/admin/vacina/cadastro";
    }

    @PostMapping("/cadastrar")
    public String salvar(@Valid @ModelAttribute("vacina") Vacina vacina, BindingResult result, ModelMap model) {

        System.err.println("entrou ..." + vacina);

        servico.cadastrar(vacina);
        
        System.err.println("cadastrou ...");
        servico.listarTodos().forEach(System.err::println);
        
        return "/admin/vacina/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/admin/vacina/lista";
    }
}
