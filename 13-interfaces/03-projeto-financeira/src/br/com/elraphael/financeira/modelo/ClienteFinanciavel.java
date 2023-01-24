package br.com.elraphael.financeira.modelo;

public interface ClienteFinanciavel {
  double calcularLimiteAprovado();
  default double calcularJuros(double valorSolicitado) {
    if (isFinanciamentoValido(valorSolicitado, 100_000)) {
      return 1.0;
    } else if (isFinanciamentoValido(valorSolicitado, 1_000_000)) {
      return 1.5;
    }
    return 2.0;
  }

  private boolean isFinanciamentoValido(double valorSolicitado, int limiteBanco) {
    return valorSolicitado <= limiteBanco;
  }
}
