package com.grad.SistemaVacinacao.serviceImpl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.grad.SistemaVacinacao.model.Usuario;
import com.grad.SistemaVacinacao.repository.RoleRepository;
import com.grad.SistemaVacinacao.repository.UsuarioRepository;
import com.grad.SistemaVacinacao.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository UsuarioRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(Usuario Usuario) {
		Usuario.setSenha(bCryptPasswordEncoder.encode(Usuario.getSenha()));
		Usuario.setRoles(new HashSet<>(roleRepository.findAll()));
		UsuarioRepository.save(Usuario);
	}

	@Override
	public Usuario findByUsername(String username) {
		return UsuarioRepository.findByUsername(username);
	}

}