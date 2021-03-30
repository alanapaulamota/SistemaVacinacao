package com.grad.SistemaVacinacao.service;

import java.util.List;

import com.grad.SistemaVacinacao.model.CadastroUser;


/* A interface Service
*
* 
*/

public interface CadastroService {

	// metodo que retona uma lista de Usuarios cadastrados
	List<CadastroUser> findAll();

	// metodo que retorna um unico CadastroUser cadastrado, buscando pelo parametro id do
	// tipo de dado long
	CadastroUser findById(long id);

	// metodo save recebe um usuario cadastrado e salva no banco de dados
	CadastroUser save(CadastroUser cadastroUser);

}
