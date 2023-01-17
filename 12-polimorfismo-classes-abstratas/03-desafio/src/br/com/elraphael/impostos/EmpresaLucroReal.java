package br.com.elraphael.impostos;

public class EmpresaLucroReal extends PessoaJuridica {
  public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

  public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
    super(nome, faturamentoAnual, despesaAnual);
  }

  public double calcularImpostos() {
    double impostosCalculados = this.getLucroAnual() * ALIQUOTA_IMPOSTO_LUCRO;
    return impostosCalculados;
  }
}
