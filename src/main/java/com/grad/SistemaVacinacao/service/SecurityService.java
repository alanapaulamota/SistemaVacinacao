package com.grad.SistemaVacinacao.service;

public interface SecurityService {
	String findLoggedInUsername();

	void autoLogin(String username, String senha);
}