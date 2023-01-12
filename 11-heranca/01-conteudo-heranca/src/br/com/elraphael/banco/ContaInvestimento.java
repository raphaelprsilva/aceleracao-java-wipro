package br.com.elraphael.banco;

public class ContaInvestimento extends Conta {

  private double valorTotalRendimentos;

  public ContaInvestimento(Titular titular, int agencia, int numero) {
    super(titular, agencia, numero);
  }

  public double getValorTotalRendimentos() {
    return valorTotalRendimentos;
  }

  public void creditarRendimentos(double percentualJuros) {
    double valorRendimentos = this.getSaldo() * percentualJuros / 100;
    this.valorTotalRendimentos += valorRendimentos;
    this.depositar(valorRendimentos);
  }

  @Override
  public String toString() {
    return "ContaInvestimento{" +
        "titular=" + this.getTitular() +
        ", agencia=" + this.getAgencia() +
        ", numero=" + this.getNumero() +
        ", valorTotalRendimentos=" + valorTotalRendimentos +
        '}';
  }
}