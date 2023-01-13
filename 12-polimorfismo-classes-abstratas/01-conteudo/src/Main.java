import br.com.elraphael.banco.CaixaEletronico;
import br.com.elraphael.banco.Conta;
import br.com.elraphael.banco.ContaEspecial;
import br.com.elraphael.banco.Titular;

public class Main {
  public static void main(String[] args) {
    CaixaEletronico caixaEletronico = new CaixaEletronico();

    Titular raphael = new Titular("Raphael", "11122233344");
    Titular rodrigo = new Titular("Rodrigo", "19234323312");

    ContaEspecial contaRaphael = new ContaEspecial(raphael, 555, 123, 5);
    ContaEspecial contaRodrigo = new ContaEspecial(rodrigo, 322, 444, 10);

    contaRaphael.depositar(100);

    caixaEletronico.transferir(contaRaphael, contaRodrigo, 50);
    contaRaphael.imprimirDemonstrativo();
    contaRodrigo.imprimirDemonstrativo();
  }
}
