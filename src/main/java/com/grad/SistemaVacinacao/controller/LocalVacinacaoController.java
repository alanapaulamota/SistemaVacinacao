//package com.grad.SistemaVacinacao.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.grad.SistemaVacinacao.model.LocalVacinacao;
//import com.grad.SistemaVacinacao.repository.LocalVacinacaoRepository;
//
//public class LocalVacinacaoController {
//
//	@Autowired
//	private LocalVacinacaoRepository localvacinarepo;
//
//	@RequestMapping(value = "/cadastrolocalvacina", method = RequestMethod.GET)
//	public String form() {
//		return "cadastrolocalvacina";
//	}
//
//	@RequestMapping(value = "/cadastrolocalvacina", method = RequestMethod.POST)
//	public String form(LocalVacinacao localVacinacao) {
//		localvacinarepo.save(localVacinacao);
//		return "redirect/cadastrolocalvacina";
//	}
//
//	@RequestMapping("/localVacincao")
//	public ModelAndView listaLocalVacinacao() {
//		ModelAndView mv = new ModelAndView("listaLocalVacinacao");
//		Iterable<LocalVacinacao> localvacinao = localvacinarepo.findAll();
//		mv.addObject("Local de vacinação", localvacinao);
//		return mv;
//	}
//}