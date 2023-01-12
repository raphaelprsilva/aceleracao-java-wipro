import br.com.elraphael.funcionarios.Funcionario;
import br.com.elraphael.funcionarios.Programador;
import br.com.elraphael.holerite.Holerite;

public class Main {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Raphael", 100);
    Holerite holetire = funcionario.gerarHolerite(50, "Janeiro");
    holetire.imprimir();

    Programador programador = new Programador("Rodrigo", 200);
    programador.setValorBonus(25);
    Holerite holeriteRodrigo = programador.gerarHolerite(50, "Janeiro");
    holeriteRodrigo.imprimir();
  }
}
