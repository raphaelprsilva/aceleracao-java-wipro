package br.com.elraphael.financeira.modelo;

public interface ClienteFinanciavel {

  double JUROS_BAIXO_RISCO = 1.0;
  double JUROS_MEDIO_RISCO = 1.5;
  double JUROS_ALTO_RISCO = 2.0;

  double calcularLimiteAprovado();

  default double calcularJuros(double valorSolicitado) {
    if (ClienteFinanciavel.isFinanciamentoMedioValor(valorSolicitado)) {
      return JUROS_BAIXO_RISCO;
    } else if (ClienteFinanciavel.isFinanciamentoGrandeValor(valorSolicitado)) {
      return JUROS_MEDIO_RISCO;
    }
    return JUROS_ALTO_RISCO;
  }

  static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
    return valorSolicitado <= 1_000_000;
  }

  static boolean isFinanciamentoMedioValor(double valorSoliticado) {
    return valorSoliticado <= 100_000;
  }
}
