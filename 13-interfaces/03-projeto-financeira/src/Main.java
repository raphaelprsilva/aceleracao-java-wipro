import br.com.elraphael.financeira.modelo.Fazenda;
import br.com.elraphael.financeira.modelo.Funcionario;
import br.com.elraphael.financeira.modelo.Industria;
import br.com.elraphael.financeira.modelo.ParceiroFinanceiro;
import br.com.elraphael.financeira.servico.ServicoFinanciamento;
import br.com.elraphael.financeira.servico.ServicoPagamentoBonus;

public class Main {
  public static void main(String[] args) {
    var servicoFinanciamento = new ServicoFinanciamento();
    var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
    var industria = new Industria("Alimentos da Vovó", 900_000, true);
    var parceiroFinanceiro = new ParceiroFinanceiro("Empresa ABC", 2_000_000);
    var funcionario = new Funcionario("João", 18_000);

    ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
    servicoPagamentoBonus.pagar(funcionario, 10);

    servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
    servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
    servicoFinanciamento.solicitarFinanciamento(fazenda, 500_000);
  }
}
