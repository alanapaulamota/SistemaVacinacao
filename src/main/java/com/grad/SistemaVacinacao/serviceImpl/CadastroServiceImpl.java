package com.grad.SistemaVacinacao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grad.SistemaVacinacao.model.CadastroUser;
import com.grad.SistemaVacinacao.repository.CadastroRepository;
import com.grad.SistemaVacinacao.service.CadastroService;

@Service
public class CadastroServiceImpl implements CadastroService {

	// Ponto de injeção para conseguir usar as instãncias do repositório
	// CadastroRepository
	@Autowired
	CadastroRepository repositorio;

	// Metodos implementados da interface CadastroService
	@Override
	public List<CadastroUser> findAll() {
		return repositorio.findAll(); // busca todos Usuarios cadastrados
	}

	@Override
	public CadastroUser findById(long id) {
		return repositorio.findById(id).get(); // .get() serve para o obter o CadastroUser, e não um Optional
												// (repositorio)
												// de CadastroUser
	}

	@Override
	public CadastroUser save(CadastroUser cadastroUser) { // metodo save ultilizando metodo save do jpa Repository e
															// passar o usuario
		// que ta recebendo como parametro
		return repositorio.save(cadastroUser);
	}

}
