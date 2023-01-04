public class Main {
  public static void main(String[] args) {
    // intanciando um objeto com um atributo
    Produto produto1 = new Produto("Notebook");
    produto1.imprimirInformacoes();

    // intanciando um objeto com dois atributos
    Produto produto2 = new Produto("Teclado mecânico", 20);
    produto2.imprimirInformacoes();

    // temos uma exceção sendo lançada aqui
    // Produto produto3 = new Produto(null, -20);
  }
}