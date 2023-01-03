public class ServicoCobranca {
  void pagar(Fatura fatura, String... emailsCobranca) {
    // emailsCobranca é um array
    System.out.printf("A fatura de número %d, no valor total de R$ %.2f foi paga.%n", fatura.numero, fatura.valorTotal);

    for (String email : emailsCobranca) {
      System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
  }
}
