package br.com.elraphael.impostos;

public class PessoaFisica extends Pessoa{
  public static final double RECEITA_ANUAL_ISENCAO = 50_000;
  public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;
  public static final int SEM_IMPOSTOS = 0;

  private double receitaAnual;

  public PessoaFisica(String nome, double receitaAnual) {
    super(nome);
    this.receitaAnual = receitaAnual;
  }

  public double getReceitaAnual() {
    return receitaAnual;
  }

  @Override
  public double calcularImpostos() {
    if (isReceitaMenorQuePatamarEstipulado()) {
      return SEM_IMPOSTOS;
    }

    double impostoCalculado = this.getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
    return impostoCalculado;
  }

  private boolean isReceitaMenorQuePatamarEstipulado() {
    return this.getReceitaAnual() < RECEITA_ANUAL_ISENCAO;
  }

  @Override
  public String toString() {
    return "PessoaFisica{" +
        "receitaAnual=" + receitaAnual +
        '}';
  }
}
