package com.grad.SistemaVacinacao.service;

import java.util.List;

import com.grad.SistemaVacinacao.model.Login;

/* A interface Service
 *
 * 
 */

public interface LoginService {

	// metodo que retona uma lista de Usuarios Logados
	List<Login> findAll();

	// metodo que retorna um unico CadastroUser Logado, buscando pelo parametro id
	// do
	// tipo de dado long
	Login findById(long id);

	// metodo save recebe um usuario logado e salva no banco de dados
	Login save(Login login);

}
