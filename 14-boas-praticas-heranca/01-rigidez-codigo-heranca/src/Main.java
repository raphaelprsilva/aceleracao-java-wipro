import br.com.elraphael.locadora.*;

public class Main {
  public static void main(String[] args) {
    Notebook notebook = new Notebook("Macbook Pro i7", 5, 100);

    Locacao locacao = new LocacaoPorDiaSeguroItau(notebook);
    double valorDevido = locacao.calcularValorDevido(10);
    System.out.println("Valor a pagar: " + valorDevido);
  }
}
