package com.madrugabank;

import com.javabank.Conta;
import com.javabank.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        PontuacaoDecorator pontuacaoDecorator = new PontuacaoDecorator(new ContaCorrente());
        Conta conta1 = new TributacaoDecorator(pontuacaoDecorator);
        Conta conta2 = new ContaCorrente();

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.transferir(conta2, 100);

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f%n", conta2.getSaldo());
        System.out.printf("Pontuacação conta 1: %d%n", pontuacaoDecorator.getPontos());
    }
}
