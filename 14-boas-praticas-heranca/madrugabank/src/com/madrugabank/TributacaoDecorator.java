package com.madrugabank;

import com.javabank.Conta;

import java.util.Objects;

public class TributacaoDecorator extends ContaBaseDecorator {
    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    public TributacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    @Override
    public void sacar(double valorMovimentacao) {
        getContaOriginal().sacar(valorMovimentacao);
        debitarImpostoMovimentacao(valorMovimentacao);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        getContaOriginal().transferir(conta, valor);
        debitarImpostoMovimentacao(valor);
    }

    private void debitarImpostoMovimentacao(double valor) {
        getContaOriginal().sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
