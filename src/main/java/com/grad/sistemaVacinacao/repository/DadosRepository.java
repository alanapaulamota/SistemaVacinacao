package com.grad.sistemaVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.grad.sistemaVacinacao.model.DadosUsuario;

@Repository
@EnableJpaRepositories 
public interface DadosRepository extends JpaRepository<DadosUsuario, Long>{
 
	DadosUsuario salvar(DadosUsuario dados);
	
	DadosUsuario findbyId(Integer id);
	
}
