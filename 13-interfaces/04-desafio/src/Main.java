import br.com.elraphael.seguro.modelo.Caminhao;
import br.com.elraphael.seguro.modelo.CarroParticular;
import br.com.elraphael.seguro.servico.ServicoPropostaSeguro;

public class Main {
  public static void main(String[] args) {
    ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

    CarroParticular carroParticular = new CarroParticular("Onix", 25_000, 2019);
    Caminhao caminhao = new Caminhao("Caminhão X", 100_000, 2017, 8);

    servicoPropostaSeguro.emitir(carroParticular);
    servicoPropostaSeguro.emitir(caminhao);
  }
}
