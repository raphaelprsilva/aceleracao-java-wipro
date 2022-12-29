public class Main {
  public static void main(String[] args) {
    ServicoPrecificacao servicoPrecificacao = new ServicoPrecificacao();
    Produto novoProduto = new Produto();

    novoProduto.precoCusto = 100;

    servicoPrecificacao.definirPrecoVenda(novoProduto, 20);

    System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
  }
}
