package br.com.madrugamilhas.passageiro;

import java.util.Objects;

public class Participante {
  static final int SALDO_INICIAL_PADRAO = 0;

  private String nome;
  private int saldoDePontos;

  public Participante(String nome) {
    this(nome, SALDO_INICIAL_PADRAO);
  }

  private Participante(String nome, int saldoDePontosInicial) {
    Objects.requireNonNull(nome, "O nome deve ser informado");

    if (saldoDePontosInicial < 0) {
      throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
    }

    this.nome = nome;
    this.saldoDePontos = saldoDePontosInicial;
  }

  public void creditarPontos(int saldoDePontos) {
    if (saldoDePontos < 0) {
      throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
    }

    this.saldoDePontos += saldoDePontos;
  }

  public void imprimirDados() {
    System.out.printf("Nome: %s%n", this.nome);
    System.out.printf("Saldo de Pontos: %d%n", this.saldoDePontos);
  }
}

