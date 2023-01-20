import br.com.elraphael.contaspagar.modelo.Holerite;
import br.com.elraphael.contaspagar.modelo.OrdemServico;
import br.com.elraphael.contaspagar.servico.ServicoContaPagar;
import br.com.elraphael.pagamento.Beneficiario;
import br.com.elraphael.pagamento.DocumentoPagavel;
import br.com.elraphael.pagamento.MetodoPagamento;
import br.com.elraphael.pagamento.Pix;

public class Main {
  public static void main(String[] args) {
    MetodoPagamento metodoPagamento = new Pix();
    ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

    Beneficiario joao = new Beneficiario("João", "asdasda1", "1232");
    Beneficiario consultoriaA = new Beneficiario("Consultoria A", "123312", "1242");

    DocumentoPagavel holerite = new Holerite(joao, 100, 168);
    OrdemServico ordemServico = new OrdemServico(consultoriaA, 65_000);

    servicoContaPagar.pagar(holerite);
    servicoContaPagar.pagar(ordemServico);
  }
}
