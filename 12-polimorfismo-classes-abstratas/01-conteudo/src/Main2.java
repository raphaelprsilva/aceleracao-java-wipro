import br.com.elraphael.banco.*;

public class Main2 {
  public static void main(String[] args) {
    Titular rodrigo = new Titular("Rodrigo", "12332144432");
    Conta contaRodrigo = new ContaSalario(rodrigo, 123, 444, 1000.0);
    System.out.println(contaRodrigo);
  }
}
