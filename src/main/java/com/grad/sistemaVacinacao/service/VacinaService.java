package com.grad.sistemaVacinacao.service;

import com.grad.sistemaVacinacao.model.Vacina;

import java.util.List;

import javax.validation.Valid;

public interface VacinaService {

    public void cadastrar(@Valid Vacina vacina);
    
    public List<Vacina> listarTodos();
    
}
