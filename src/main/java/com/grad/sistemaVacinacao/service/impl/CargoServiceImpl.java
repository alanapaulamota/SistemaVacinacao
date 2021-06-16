package com.grad.sistemaVacinacao.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.grad.sistemaVacinacao.model.Cargo;
import com.grad.sistemaVacinacao.repository.CargoRepository;
import com.grad.sistemaVacinacao.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService {

	private CargoRepository repositorio;

	public CargoServiceImpl(CargoRepository repositorio) {
        this.repositorio = repositorio;
    }

	@Override
	public void cadastrar(@Valid Cargo Cargo) {
		repositorio.save(Cargo);
	}

	public List<Cargo> listarTodos() {
		return repositorio.findAll();
	}
}
