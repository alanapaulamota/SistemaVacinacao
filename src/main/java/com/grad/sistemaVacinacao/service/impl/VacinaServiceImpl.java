package com.grad.sistemaVacinacao.service.impl;

import com.grad.sistemaVacinacao.model.Vacina;
import com.grad.sistemaVacinacao.repository.VacinaRepository;
import com.grad.sistemaVacinacao.service.VacinaService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

@Service
public class VacinaServiceImpl implements VacinaService {

    private VacinaRepository repositorio;

    public VacinaServiceImpl(VacinaRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void cadastrar(@Valid Vacina vacina) {
        repositorio.save(vacina);
    }

    public List<Vacina> listarTodos() {
        return repositorio.findAll();
    }
}
