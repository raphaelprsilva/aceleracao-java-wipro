import br.com.elraphael.banco.Conta;
import br.com.elraphael.banco.ContaInvestimento;
import br.com.elraphael.banco.Titular;

public class Main2 {
  public static void main(String[] args) {
    Titular rodrigo = new Titular("Rodrigo", "12332144432");
    Conta contaRodrigo = new ContaInvestimento(rodrigo, 123, 444);
    System.out.println(contaRodrigo);
  }
}
