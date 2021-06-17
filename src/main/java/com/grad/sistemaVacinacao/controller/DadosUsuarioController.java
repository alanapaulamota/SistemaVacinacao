package com.grad.sistemaVacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DadosUsuarioController {

	@GetMapping(value = { "/AltDados" })
	public ModelAndView dados() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("AltDados");
		return modelAndView;
	}
}

//@Controller
//@RequestMapping("/AltDados")
//public class DadosUsuarioController {
//
//    private DadosUsuarioService servico;
//
//    public DadosUsuarioController(DadosUsuarioService servico) {
//        this.servico = servico;
//    }
//
//    @GetMapping("/cadastrar")
//    public String cadastrar() {
//        //TODO carregar dados
//        return "/AltDados";
//    }
//
//    @PostMapping("/cadastrar")
//    public String salvar(@Valid @ModelAttribute("DadosUsuario") DadosUsuario DadosUsuario, BindingResult result, ModelMap model) {
//
//        System.err.println("entrou ..." + DadosUsuario);
//
//        servico.cadastrar(DadosUsuario);
//        
//        System.err.println("cadastrou ...");
//        servico.listarTodos().forEach(System.err::println);
//        
//        return "/AltDados";
//    }
//
////    @GetMapping("/listar")
////    public String listar() {
////        return "/admin/DadosUsuario/lista";
////    }
//}