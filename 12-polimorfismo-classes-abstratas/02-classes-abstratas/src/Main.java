import br.com.elraphael.fiscal.GestorFiscal;
import br.com.elraphael.fiscal.NotaFiscal;
import br.com.elraphael.fiscal.NotaFiscalProduto;
import br.com.elraphael.fiscal.NotaFiscalServico;

public class Main {
  public static void main(String[] args) {

    GestorFiscal gestorFiscal = new GestorFiscal();

    var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
    var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

    gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

//    System.out.println(nfBolaFutebol.calcularImpostos());
//    System.out.println(nfReparoMotor.calcularImpostos());
  }
}
