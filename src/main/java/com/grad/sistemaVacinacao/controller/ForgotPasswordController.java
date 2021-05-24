package com.grad.sistemaVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grad.sistemaVacinacao.model.ConfirmationToken;
import com.grad.sistemaVacinacao.model.User;
import com.grad.sistemaVacinacao.repository.ConfirmationTokenRepository;
import com.grad.sistemaVacinacao.repository.UserRepository;
import com.grad.sistemaVacinacao.service.EmailSenderService;

@Controller
@Deprecated
public class ForgotPasswordController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ConfirmationTokenRepository confirmationTokenRepository;

	@Autowired
	private EmailSenderService emailSenderService;
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

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
			mailMessage.setSubject("Complete Password Reset!");
			mailMessage.setFrom("alanapaula.job@gmail.com");
			mailMessage.setText("To complete the password reset process, please click here: "
					+ "http://localhost:8082/confirm-reset?token=" + confirmationToken.getConfirmationToken());

			emailSenderService.sendEmail(mailMessage);

			modelAndView.addObject("message",
					"Request to reset password received. Check your inbox for the reset link.");
			modelAndView.setViewName("successForgotPassword");

		} else {
			modelAndView.addObject("message", "This email does not exist!");
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
			modelAndView.addObject("emailId", user.getEmail());
			modelAndView.setViewName("resetPassword");
		} else {
			modelAndView.addObject("message", "The link is invalid or broken!");
			modelAndView.setViewName("error");
		}

		return modelAndView;
	}

	/**
	 * Receive the token from the link sent via email and display form to reset
	 * password
	 */
	@RequestMapping(value = "/reset-password", method = RequestMethod.POST)
	public ModelAndView resetUserPassword(ModelAndView modelAndView, User user) {
		// ConfirmationToken token =
		// confirmationTokenRepository.findByConfirmationToken(confirmationToken);

		if (user.getEmail() != null) {
			// use email to find user
			User tokenUser = userRepository.findByEmail(user.getEmail());
			tokenUser.setActive(true);
			tokenUser.setPassword(encoder.encode(user.getPassword()));
			// System.out.println(tokenUser.getPassword());
			userRepository.save(tokenUser);
			modelAndView.addObject("message",
					"Password successfully reset. You can now log in with the new credentials.");
			modelAndView.setViewName("successResetPassword");
		} else {
			modelAndView.addObject("message", "The link is invalid or broken!");
			modelAndView.setViewName("error");
		}

		return modelAndView;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public ConfirmationTokenRepository getConfirmationTokenRepository() {
		return confirmationTokenRepository;
	}

	public void setConfirmationTokenRepository(ConfirmationTokenRepository confirmationTokenRepository) {
		this.confirmationTokenRepository = confirmationTokenRepository;
	}

	public EmailSenderService getEmailSenderService() {
		return emailSenderService;
	}

	public void setEmailSenderService(EmailSenderService emailSenderService) {
		this.emailSenderService = emailSenderService;
	}

}
