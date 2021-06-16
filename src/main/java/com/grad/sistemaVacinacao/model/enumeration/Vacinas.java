package com.grad.sistemaVacinacao.model.enumeration;

public enum Vacinas {

		COVID("Covid 19"),	
		INFLUENZA("Influenza"),
		BCG("Bcg"),
		TETANO("tetano"),
		H1N1("H1N1"),
		SARAMPO("Sarampo"),
		MENINGITE("Meningite");
		
		
	
	private String vacinas;
	
	private Vacinas(String vacinas) {
		this.vacinas = vacinas;
		
	}
}
