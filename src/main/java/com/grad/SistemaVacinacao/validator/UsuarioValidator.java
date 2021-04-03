package com.grad.SistemaVacinacao.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.grad.SistemaVacinacao.model.Usuario;
import com.grad.SistemaVacinacao.service.UsuarioService;

@Component
public class UsuarioValidator implements Validator {
	@Autowired
	private UsuarioService userService;

	@Override
	public boolean supports(Class<?> aClass) {
		return Usuario.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		Usuario user = (Usuario) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
			errors.rejectValue("username", "Username tamanho incorreto");
		}
		if (userService.findByUsername(user.getUsername()) != null) {
			errors.rejectValue("username", "Username Duplicado");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (user.getSenha().length() < 8 || user.getSenha().length() > 32) {
			errors.rejectValue("senha", "Senha tamanho incorreto");
		}

		if (!user.getConfirmaSenha().equals(user.getSenha())) {
			errors.rejectValue("Confirma senha", "Digite a senha correta");
		}
	}
}
