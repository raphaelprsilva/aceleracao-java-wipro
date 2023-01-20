package br.com.elraphael.contaspagar.servico;

import br.com.elraphael.pagamento.DocumentoPagavel;
import br.com.elraphael.pagamento.MetodoPagamento;


public class ServicoContaPagar {
  private MetodoPagamento metodoPagamento;

  public ServicoContaPagar(MetodoPagamento metodoPagamento) {
    this.metodoPagamento = metodoPagamento;
  }

  public void pagar(DocumentoPagavel documento) {

    metodoPagamento.pagar(documento);
  }
}
