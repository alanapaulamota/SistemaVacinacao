package com.grad.sistemaVacinacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grad.sistemaVacinacao.model.ConfirmationToken;
import com.grad.sistemaVacinacao.model.User;
import com.grad.sistemaVacinacao.repository.ConfirmationTokenRepository;
import com.grad.sistemaVacinacao.repository.UserRepository;
import com.grad.sistemaVacinacao.service.EmailSenderService;
import com.grad.sistemaVacinacao.service.UserService;

/**
 * TODO alterar URL das paginas administrativas Classe controller referente à
 * {@link com.grad.sistemaVacinacao.model.User}.
 *
 */
@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ConfirmationTokenRepository confirmationTokenRepository;

	@Autowired
	private EmailSenderService emailSenderService;

	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	@GetMapping(value = { "/", "/login" })
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@GetMapping(value = "/registration")
	public ModelAndView registration() {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("registration");
		return modelAndView;
	}

	@PostMapping(value = "/registration")
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByUserName(user.getApelido());
		if (userExists != null) {
			bindingResult.rejectValue("userName", "error.user",
					"Já existe um usuário registrado com o nome de usuário fornecido");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("registration");
		} else {
			userService.saveUser(user);
			modelAndView.addObject("successMessage", "O usuário foi registrado com sucesso");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("registration");

		}
		return modelAndView;
	}

	@GetMapping(value = "/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByUserName(auth.getName());
		modelAndView.addObject("userName", "Bem-Vindo " + user.getApelido() + "/" + user.getNome() + " "
				+ user.getSobreNome() + " (" + user.getEmail() + ")");
		modelAndView.setViewName("/home");
		return modelAndView;
	}

//	@GetMapping(value = "/admin/home")
//	public ModelAndView homeAdmin() {
//		ModelAndView modelAndView = new ModelAndView();
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByUserName(auth.getNome());
//		modelAndView.addObject("userName", "Bem-Vindo " + user.getApelido() + "/" + user.getNome() + " "
//				+ user.getSobrenome() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage", "Conteúdo disponível apenas para usuários com função administrativa");
//		modelAndView.setViewName("admin/home");
//		return modelAndView;
//	}

	@GetMapping("/admin/homeAdmin")
	public String homeAdmin() {
		return "/admin/homeAdmin";
	}

	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
	public ModelAndView displayResetPassword(ModelAndView modelAndView, User user) {
		modelAndView.addObject("user", user);
		modelAndView.setViewName("forgotPassword");
		return modelAndView;
	}

	@RequestMapping(value = "/forgot-password", method = RequestMethod.POST)
	public ModelAndView forgotUserPassword(ModelAndView modelAndView, User user) {
		User existingUser = userRepository.findByEmail(user.getEmail());
		if (existingUser != null) {
			ConfirmationToken confirmationToken = new ConfirmationToken(existingUser);

			confirmationTokenRepository.save(confirmationToken);

			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(existingUser.getEmail());
			mailMessage.setSubject("Redefinição de senha completa");
			mailMessage.setFrom("alanapaula.job@gmail.com");
			mailMessage.setText("Para concluir o processo de redefinição de senha, clique aqui:  "
					+ "http://localhost:8082/confirm-reset?token=" + confirmationToken.getConfirmationToken());

			emailSenderService.sendEmail(mailMessage);

			modelAndView.addObject("message",
					"Solicitação de redefinição de senha recebida. Verifique seu email para o link de redefinição..");
			modelAndView.setViewName("sucesso" + "Esqueci a senha");

		} else {
			modelAndView.addObject("message", "Este endereço de email não existe!");
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/confirm-reset", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView validateResetToken(ModelAndView modelAndView, @RequestParam("token") String confirmationToken) {
		ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

		if (token != null) {
			User user = userRepository.findByEmail(token.getUser().getEmail());
			user.setActive(true);
			userRepository.save(user);
			modelAndView.addObject("user", user);
			modelAndView.addObject("email", user.getEmail());
			modelAndView.setViewName("Senha redefinida com sucesso");
		} else {
			modelAndView.addObject("message", "O link é inválido ou inexistente!");
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/reset-password", method = RequestMethod.POST)
	public ModelAndView resetUserPassword(ModelAndView modelAndView, User user) {
		if (user.getEmail() != null) {
			// Use email to find user
			User tokenUser = userRepository.findByEmail(user.getEmail());
			tokenUser.setSenha(encoder.encode(user.getSenha()));
			userRepository.save(tokenUser);
			modelAndView.addObject("message",
					"Senha redefinida com sucesso. Agora você pode fazer login com as novas credenciais ");
			modelAndView.setViewName("Senha redefinida com sucesso");
		} else {
			modelAndView.addObject("message", "O link é inválido ou inexistente!");
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}

}