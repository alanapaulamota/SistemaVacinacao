package com.grad.SistemaVacinacao.service;

import java.util.List;

import com.grad.SistemaVacinacao.model.Usuario;

/* A interface Service
*
* 
*/

public interface UsuarioService {
//
//	// metodo que retona uma lista de Usuarios cadastrados
//	List<Usuario> findAll();
//
//	// metodo que retorna um unico CadastroUser cadastrado, buscando pelo parametro id do
//	// tipo de dado long
//	Usuario findById(long id);
//
//	// metodo save recebe um usuario cadastrado e salva no banco de dados
//	Usuario save(Usuario cadastroUser);

	void save(Usuario user);

	Usuario findByUsername(String username);
}