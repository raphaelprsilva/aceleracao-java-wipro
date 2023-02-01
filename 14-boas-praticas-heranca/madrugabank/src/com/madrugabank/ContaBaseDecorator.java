package com.madrugabank;

import com.javabank.Conta;

public abstract class ContaBaseDecorator implements Conta {
    private Conta contaOriginal;

    public ContaBaseDecorator(Conta contaOriginal) {
        this.contaOriginal = contaOriginal;
    }

    public Conta getContaOriginal() {
        return contaOriginal;
    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }
}
