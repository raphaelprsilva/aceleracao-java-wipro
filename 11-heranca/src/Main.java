import br.com.elraphael.banco.Conta;
import br.com.elraphael.banco.ContaEspecial;
import br.com.elraphael.banco.Titular;

public class Main {
  public static void main(String[] args) {
    ContaEspecial conta1 = new ContaEspecial();
    Titular raphael = new Titular("Raphael", "11122233344");
    conta1.setTitular(raphael);
    conta1.setAgencia(1234);
    conta1.setNumero(3322);
    conta1.setLimiteChequeEspecial(1000);

    conta1.depositar(100);
    conta1.imprimirDemonstrativo();

    conta1.sacar(150);
    conta1.imprimirDemonstrativo();
  }
}
