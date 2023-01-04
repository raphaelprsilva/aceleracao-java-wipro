public class Main {
  public static void main(String[] args) {
    // intanciando um objeto com um atributo
    Produto produto1 = new Produto("Notebook");
    System.out.println(produto1.nome);
    System.out.println(produto1.quantidadeEstoque);

    // intanciando um objeto com dois atributos
    Produto produto2 = new Produto("Teclado mecânico", 20);
    System.out.println(produto2.nome);
    System.out.println(produto2.quantidadeEstoque);

    // temos uma exceção sendo lançada aqui
    Produto produto3 = new Produto(null, -20);
  }
}