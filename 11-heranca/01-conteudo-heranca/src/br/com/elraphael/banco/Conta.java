package br.com.elraphael.banco;

import java.util.Objects;

public class Conta {

  private final Titular titular;
  private final int agencia;
  private final int numero;
  private double saldo;

  public Conta(Titular titular, int agencia, int numero) {
    this.titular = titular;
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = 0;
  }

  public Titular getTitular() {
    return titular;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  protected void validarSaldoParaSaque(double valorSaque) {
    if (this.getSaldo() < valorSaque) {
      throw new RuntimeException("Saldo insuficiente para saque");
    }
  }

  protected void checarValorSaquePositivo(double valorSaque) {
    if (valorSaque <= 0) {
      throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
    }
  }

  public void sacar(double valorSaque) {
    this.checarValorSaquePositivo(valorSaque);
    this.validarSaldoParaSaque(valorSaque);

    saldo -= valorSaque;
  }

  public void depositar(double valorDeposito) {
    if (valorDeposito <= 0) {
      throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
    }

    saldo += valorDeposito;
  }

  public void imprimirDemonstrativo() {
    System.out.println();
    System.out.printf("Agência: %d%n", getAgencia());
    System.out.printf("Conta: %d%n", getNumero());
    System.out.printf("Titular: %s%n", getTitular().getNome());
    System.out.printf("Saldo: %.2f%n", getSaldo());
  }

  @Override
  public String toString() {
    return "Conta{" +
        "titular=" + titular +
        ", agencia=" + agencia +
        ", numero=" + numero +
        ", saldo=" + saldo +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Conta conta = (Conta) obj;
    return agencia == conta.agencia && numero == conta.numero && Double.compare(conta.saldo, saldo) == 0 && Objects.equals(titular, conta.titular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titular, agencia, numero, saldo);
  }
}