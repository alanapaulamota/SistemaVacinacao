package com.grad.vacinacao.repository;

import com.grad.vacinacao.model.DadosUsuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories 
public interface DadosRepository extends JpaRepository<DadosUsuario, Long>{
 
	//DadosUsuario salvar(DadosUsuario dados);
	
	DadosUsuario findById(Integer id);
	
}
