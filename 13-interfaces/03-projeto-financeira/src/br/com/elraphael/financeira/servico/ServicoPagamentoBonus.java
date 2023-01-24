package br.com.elraphael.financeira.servico;

import br.com.elraphael.financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

  public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
    double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

    // aqui teria a implementação da lógica de pagamento
    System.out.printf("Bônus pago no valor de %.2f%n", valorBonus);
  }
}
