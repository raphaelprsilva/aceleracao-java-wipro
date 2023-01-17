import br.com.elraphael.impostos.EmpresaLucroReal;
import br.com.elraphael.impostos.EmpresaSimples;
import br.com.elraphael.impostos.GestorDeImpostos;
import br.com.elraphael.impostos.PessoaFisica;

public class Main {
  public static void main(String[] args) {
    GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

    PessoaFisica joao = new PessoaFisica("João", 45_000);
    PessoaFisica maria = new PessoaFisica("Maria", 180_000);

    EmpresaSimples barZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
    EmpresaLucroReal codeConsultoria = new EmpresaLucroReal("Code Consultoria", 1_000_000, 300_000);

    gestorDeImpostos.adicionar(joao);
    gestorDeImpostos.adicionar(maria);
    gestorDeImpostos.adicionar(barZe);
    gestorDeImpostos.adicionar(codeConsultoria);

    System.out.printf("Total impostos: %.2f%n", gestorDeImpostos.getValorTotalImpostos());
  }
}
