//package com.grad.sistemaVacinacao.model;
//
//import java.time.LocalDateTime;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "agendamento")
//public class Agendamento {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "agendamento_id")
//	Long id;
//
//	@Column(name = "text")
//	String text;
//
//	@Column(name = "localDateTime_start")
//	LocalDateTime start;
//
//	@Column(name = "localDateTime_end")
//	LocalDateTime end;
//
//	@Column(name = "color")
//	String color;
//}