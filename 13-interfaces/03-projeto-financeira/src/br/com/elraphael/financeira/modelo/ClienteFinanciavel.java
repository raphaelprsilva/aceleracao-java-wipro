package br.com.elraphael.financeira.modelo;

public interface ClienteFinanciavel {
  double calcularLimiteAprovado();
  default double calcularJuros(double valorSolicitado) {
    if (ClienteFinanciavel.isFinanciamentoMedioValor(valorSolicitado)) {
      return 1.0;
    } else if (ClienteFinanciavel.isFinanciamentoGrandeValor(valorSolicitado)) {
      return 1.5;
    }
    return 2.0;
  }

  static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
    return valorSolicitado <= 1_000_000;
  }

  static boolean isFinanciamentoMedioValor(double valorSoliticado) {
    return valorSoliticado <= 100_000;
  }
}
