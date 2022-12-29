public class ServicoPrecificacao {
  void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
    produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
  }
}
