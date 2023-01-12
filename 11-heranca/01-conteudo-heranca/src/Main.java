import br.com.elraphael.banco.Conta;
import br.com.elraphael.banco.Titular;

public class Main {
  public static void main(String[] args) {
    Titular raphael = new Titular("Raphael", "11122233344");
    Conta conta1 = new Conta(raphael, 555, 123);

    conta1.depositar(100);
    conta1.imprimirDemonstrativo();

    conta1.sacar(150);
    conta1.imprimirDemonstrativo();
  }
}
