package br.com.elraphael.banco;

public class ContaEspecial extends ContaInvestimento {

  private double tarifaMensal;
  private double limiteChequeEspecial;

  public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
    super(titular, agencia, numero);
    this.tarifaMensal = tarifaMensal;
  }

  public double getTarifaMensal() {
    return tarifaMensal;
  }

  public void setTarifaMensal(double tarifaMensal) {
    this.tarifaMensal = tarifaMensal;
  }

  public double getLimiteChequeEspecial() {
    return limiteChequeEspecial;
  }

  public void setLimiteChequeEspecial(double limiteChequeEspecial) {
    this.limiteChequeEspecial = limiteChequeEspecial;
  }

  public double getSaldoDisponivel() {
    return this.getSaldo() + this.getLimiteChequeEspecial();
  }

  @Override
  protected void validarSaldoParaSaque(double valorSaque) {
    if (this.getSaldoDisponivel() < valorSaque) {
      throw new RuntimeException("Saldo insuficiente para saque");
    }
  }

  @Override
  public void imprimirDemonstrativo() {
    super.imprimirDemonstrativo();
    System.out.printf("Saldo Disponível: %.2f%n", getSaldoDisponivel());
  }

  public void debitarTarifaMensal() {
    sacar(this.getTarifaMensal());
  }
}