package br.com.elraphael.banco;

public class ContaInvestimento extends Conta {

  private double valorTotalRendimentos;

  public ContaInvestimento() {
    super(0);
  }

  public double getValorTotalRendimentos() {
    return valorTotalRendimentos;
  }

  public void creditarRendimentos(double percentualJuros) {
    double valorRendimentos = this.getSaldo() * percentualJuros / 100;
    this.valorTotalRendimentos += valorRendimentos;
    this.depositar(valorRendimentos);
  }
}