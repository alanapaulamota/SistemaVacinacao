package com.grad.vacinacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Protipo FIGMA -
 * https://www.figma.com/file/TkTm15RwBqsePD6Quh3Da0/SNV?node-id=0%3A1 
 * Classe responsável pela execução da aplicação.
 */
@SpringBootApplication
public class SistemaVacinacaoApplication {

	/**
	 * Método principal da aplicação responsável por executá-la.
	 * 
	 * @param args Refere-se aos argumentos que serão passados para esse método.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SistemaVacinacaoApplication.class, args);
	}

	// TODO:
	// https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
	// - nome de pacote
	// - EstoqueVacina --> preço ???

}