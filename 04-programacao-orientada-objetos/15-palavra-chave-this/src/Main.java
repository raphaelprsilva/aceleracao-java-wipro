public class Main {
  public static void main(String[] args) {
    Produto novoProduto = new Produto();
    novoProduto.precoCusto = 100;

    novoProduto.alterarPrecoCusto(120);

    System.out.printf("Novo Preço de Custo: %.2f%n", novoProduto.precoCusto);
  }
}
