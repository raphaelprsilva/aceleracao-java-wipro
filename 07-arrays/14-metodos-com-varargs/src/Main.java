public class Main {
  public static void main(String[] args) {
    Fatura fatura = new Fatura();
    fatura.numero = 123;
    fatura.valorTotal = 1_345.23;

    ServicoCobranca servicoCobranca = new ServicoCobranca();

    // 1ª maneira
    // String[] emailsCobranca = {"fulano@email.com", "ciclano@email.com"};
    // servicoCobranca.pagar(fatura, emailsCobranca);

    // 2ª maneira
    // servicoCobranca.pagar(fatura, new String[]{"fulano@email.com", "ciclano@email.com"});

    // com varargs
    servicoCobranca.pagar(fatura, "fulano@email", "ciclano@email.com");
  }
}
