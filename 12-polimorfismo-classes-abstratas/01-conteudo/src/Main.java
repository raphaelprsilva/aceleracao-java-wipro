import br.com.elraphael.banco.Conta;
import br.com.elraphael.banco.ContaEspecial;
import br.com.elraphael.banco.Titular;

public class Main {
  public static void main(String[] args) {
    Titular raphael = new Titular("Raphael", "11122233344");
    Conta conta1 = new Conta(raphael, 555, 123);
    ContaEspecial contaEspecial = new ContaEspecial(raphael, 555, 123, 10);

    conta1.depositar(100);

    contaEspecial.depositar(150);

    // fazendo upcasting, ou seja, transformando uma conta especial em uma conta
    // a variável conta será enxergada como uma conta normal, mas o objeto é uma conta especial
    Conta conta = (Conta) contaEspecial;

    System.out.println(contaEspecial.getClass().getName());
    System.out.println(conta.getClass().getName());
  }
}
