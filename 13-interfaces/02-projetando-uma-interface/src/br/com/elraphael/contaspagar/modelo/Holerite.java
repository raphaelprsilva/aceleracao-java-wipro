package br.com.elraphael.contaspagar.modelo;

import br.com.elraphael.pagamento.Beneficiario;
import br.com.elraphael.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {
  private Beneficiario funcionario;
  private double valorHora;
  private int quantidadeHoras;

  public Holerite(Beneficiario beneficiario, double valorHora, int quantidadeHoras) {
    this.funcionario = beneficiario;
    this.valorHora = valorHora;
    this.quantidadeHoras = quantidadeHoras;
  }

  public void setFuncionario(Beneficiario beneficiario) {
    this.funcionario = beneficiario;
  }

  public Beneficiario getFuncionario() {
    return funcionario;
  }

  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  public int getQuantidadeHoras() {
    return quantidadeHoras;
  }

  public void setQuantidadeHoras(int quantidadeHoras) {
    this.quantidadeHoras = quantidadeHoras;
  }

  @Override
  public double getValorTotal() {
    return getValorHora() * getQuantidadeHoras();
  }

  @Override
  public Beneficiario getBeneficiario() {
    return getFuncionario();
  }
}
