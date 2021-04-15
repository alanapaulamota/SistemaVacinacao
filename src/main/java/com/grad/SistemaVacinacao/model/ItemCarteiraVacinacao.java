package com.grad.SistemaVacinacao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemCarteiraVacinacao implements Serializable {
    private Long id;
    private Vacina vacina;
    private java.util.Date data;
    private BigDecimal valor;
    private Enfermeiro enfermeiro;
    // local
    // ...
}
