package br.com.elraphael.contaspagar.servico;

import br.com.elraphael.pagamento.Beneficiario;
import br.com.elraphael.pagamento.DocumentoPagavel;

public class ServicoContaPagar {

  public void pagar(DocumentoPagavel documento) {
    Beneficiario beneficiario = documento.getBeneficiario();

    if (beneficiario.naoPossuiChavePix()) {
      throw new RuntimeException("Beneficiário não possui chave pix");
    }

    System.out.printf("Efetuando PIX para %s no valor de %.2f com a chave %s%n",
        beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
  }
}
