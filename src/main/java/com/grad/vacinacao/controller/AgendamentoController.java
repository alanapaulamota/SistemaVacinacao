package com.grad.vacinacao.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.grad.vacinacao.model.Agendamento;
import com.grad.vacinacao.repository.AgendamentoRepository;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Classe controller referente à
 * {@link com.grad.vacinacao.model.Agendamento}.
 *
 */
@Controller
//@RequestMapping("/agendamento")
public class AgendamentoController {

	@Autowired
	AgendamentoRepository agendamentoRepository;

	@GetMapping("/agendamento")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	Iterable<Agendamento> agendamento(@RequestParam("start") @DateTimeFormat(iso = ISO.DATE_TIME) LocalDateTime start,
			@RequestParam("end") @DateTimeFormat(iso = ISO.DATE_TIME) LocalDateTime end) {
		return agendamentoRepository.findBetween(start, end);
	}

	@PostMapping("/agendamento")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@Transactional
	Agendamento createAgendamento(@RequestBody AgendamentoCreateParams params) {

		Agendamento e = new Agendamento();
		e.setStart(params.start);
		e.setEnd(params.end);
		e.setText(params.text);
		agendamentoRepository.save(e);

		return e;
	}

	@PatchMapping("/agendamento")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@Transactional
	Agendamento moveAgendamento(@RequestBody AgendamentoMoveParams params) {

		Agendamento e = agendamentoRepository.findById(params.id).get();
		e.setStart(params.start);
		e.setEnd(params.end);
		agendamentoRepository.save(e);

		return e;
	}

	@PostMapping("/agendamento/setColor")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@Transactional
	Agendamento setColor(@RequestBody SetColorParams params) {

		Agendamento e = agendamentoRepository.findById(params.id).get();
		e.setColor(params.color);
		agendamentoRepository.save(e);

		return e;
	}

	@DeleteMapping("/agendamento")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@Transactional
	AgendamentoDeleteResponse deleteAgendamento(@RequestBody AgendamentoDeleteParams params) {

		agendamentoRepository.deleteById(params.id);

		return new AgendamentoDeleteResponse() {
			{
				message = "Excluído";
			}
		};
	}

	public static class AgendamentoDeleteParams {
		public Long id;
	}

	public static class AgendamentoDeleteResponse {
		public String message;
	}

	public static class AgendamentoCreateParams {
		public LocalDateTime start;
		public LocalDateTime end;
		public String text;
	}

	public static class AgendamentoMoveParams {
		public Long id;
		public LocalDateTime start;
		public LocalDateTime end;
	}

	public static class SetColorParams {
		public Long id;
		public String color;
	}

}