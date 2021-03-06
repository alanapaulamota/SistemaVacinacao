package com.grad.SistemaVacinacao.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.grad.sistemaVacinacao.model.User;
import com.grad.sistemaVacinacao.repository.RoleRepository;
import com.grad.sistemaVacinacao.repository.UserRepository;
import com.grad.sistemaVacinacao.service.UserService;

public class UserServiceTest {

	@Mock
	private UserRepository mockUserRepository;
	@Mock
	private RoleRepository mockRoleRepository;
	@Mock
	private BCryptPasswordEncoder mockBCryptPasswordEncoder;

	private UserService userServiceUnderTest;
	private User user;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		initMocks(this);
		userServiceUnderTest = new UserService(mockUserRepository, mockRoleRepository, mockBCryptPasswordEncoder);
		user = User.builder().id(1).name("Alana").lastName("Paula").email("test@test.com").build();

		Mockito.when(mockUserRepository.save(any())).thenReturn(user);
		Mockito.when(mockUserRepository.findByEmail(anyString())).thenReturn(user);
	}

	@Test
	public void testBuscarPorByEmail() {
		final String email = "test@test.com";

		final User result = userServiceUnderTest.findUserByEmail(email);

		assertEquals(email, result.getEmail());
	}

	@Test
	public void testSalvarUsuario() {
		final String email = "test@test.com";

		User result = userServiceUnderTest.saveUser(User.builder().build());

		assertEquals(email, result.getEmail());
	}
}
