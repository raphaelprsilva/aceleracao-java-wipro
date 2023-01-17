package br.com.elraphael.impostos;

public class EmpresaSimples extends PessoaJuridica {
  public static final double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.06;

  public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
    super(nome, faturamentoAnual, despesaAnual);
  }

  public double calcularImpostos() {
    double impostosCalculados = this.getFaturamentoAnual() + ALIQUOTA_IMPOSTO_FATURAMENTO;
    return impostosCalculados;
  }
}
