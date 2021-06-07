package com.grad.vacinacao.service;

import com.grad.vacinacao.model.Role;
import com.grad.vacinacao.model.User;
import com.grad.vacinacao.repository.RoleRepository;
import com.grad.vacinacao.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Serviço para gerenciamento de {@link com.grad.vacinacao.model.User}.
 */
@Service
public class UserService {

	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public UserService(UserRepository userRepository, RoleRepository roleRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User findUserByUserName(String userName) {
		return userRepository.findByApelido(userName);
	}

	public User saveUser(User user) {
		user.setSenha(bCryptPasswordEncoder.encode(user.getSenha()));
		user.setActive(true);
		Role userRole = roleRepository.findByRole("ADMIN");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		return userRepository.save(user);
	}

}