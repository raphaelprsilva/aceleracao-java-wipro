package br.com.elraphael.seguro.servico;

import br.com.elraphael.seguro.modelo.BemSeguravel;

public class ServicoPropostaSeguro {
  public void emitir(BemSeguravel bem) {
    System.out.println("-----------------------");
    System.out.println("Proposta Seguro");
    System.out.println("-----------------------");
    System.out.println(bem.descrever());
    System.out.printf("Prêmio: %.2f", bem.calcularValorPremio());
  }
}
