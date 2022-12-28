public class Carro {
  String fabricante;
  String modelo;
  String cor;
  double precoCompra;
  int anoFabricacao;
  Pessoa proprietario;

  double calcularIpva() {
    int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
    int dezAnos = 10;
    boolean ehOTempoDeUsoEmAnosMaiorQue10Anos = tempoDeUsoEmAnos >= dezAnos;
    double valorDoIpva;

    if (ehOTempoDeUsoEmAnosMaiorQue10Anos) {
      valorDoIpva = 0;
      return valorDoIpva;
    }

    double taxaDoIpva = 0.04;
    valorDoIpva = calcularValorRevenda() * taxaDoIpva;

    return valorDoIpva;
  }

  void imprimirResumoDepreciacao() {
    int tempoDeUso = calcularTempoDeUsoEmAnos();
    double valorRevenda = calcularValorRevenda();

    System.out.printf("Tempo de uso em anos: %d%n", tempoDeUso);
    System.out.printf("Valor da Revenda: %6.2f%n", valorRevenda);
  }

  int calcularTempoDeUsoEmAnos() {
    return 2022 - anoFabricacao;
  }

  // double - significa que o método retorna um double
  double calcularValorRevenda() {
    // o escopo dessa variável é apenas dentro do método
    int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
    int vidaUtilEmAnos = 20;
    double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

    if (valorRevenda < 0) {
      valorRevenda = 0;
    }

    return valorRevenda;
  }
}