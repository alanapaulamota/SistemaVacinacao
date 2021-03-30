package com.grad.SistemaVacinacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.grad.SistemaVacinacao.model.CadastroUser;
import com.grad.SistemaVacinacao.repository.CadastroRepository;

@SpringBootApplication
public class SistemaVacinacaoApplication { //extends SpringBootServletInitializer implements CommandLineRunner {

//	@Autowired
//	CadastroRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(SistemaVacinacaoApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(SistemaVacinacaoApplication.class);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		saveUsuario();
//	}
//
//	// Teste: Apaga todos os usuarios cadastrados no site, deixando apenas os
//	// cadastrados abaixo ao subir a aplicacao
//	public void saveUsuario() {
//		repositorio.deleteAll();
//
//		// Fazendo testes de que ta salvando realmente no banco de dados
//		List<CadastroUser> usuarioList = new ArrayList<>();
//		CadastroUser user1 = new CadastroUser();
//		user1.setNome("Alana Paula");
//		user1.setCpf("062.913.671-81");
//		user1.setSenha("030626Df");
////		user1.setSenha(new BCryptPasswordEncoder().encode("030626Df"));
//		user1.setEmail("alana@upis.com");
//
//		CadastroUser user2 = new CadastroUser();
//		user2.setNome("Lucas Vilas Boas");
//		user2.setCpf("055.915.641-54");
////		user2.setSenha(new BCryptPasswordEncoder().encode("1234567Df"));
//		user2.setSenha("1234567Df");
//		user2.setEmail("lucas@upis.com");
//
//		CadastroUser user3 = new CadastroUser();
//		user3.setNome("Matheus Eduardo");
//		user3.setCpf("049.953.479-87");
////		user3.setSenha(new BCryptPasswordEncoder().encode("78945678Df"));
//		user3.setSenha("78945678Df");
//		user3.setEmail("peterudu@upis.com");
//
//		usuarioList.add(user1);
//		usuarioList.add(user2);
//		usuarioList.add(user3);
//
//		for (CadastroUser cadastroUser : usuarioList) {
//			CadastroUser usuarioSaved = repositorio.save(cadastroUser);
//			System.out.println(usuarioSaved);
//		}
//
//		// teste:busca por CPF
//		System.out.println(">>> " + repositorio.findByCpf("062.913.671-81"));
//
//	}
}