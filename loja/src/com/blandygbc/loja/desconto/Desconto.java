package com.blandygbc.loja.desconto;

import java.math.BigDecimal;

import com.blandygbc.loja.orcamento.Orcamento;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
