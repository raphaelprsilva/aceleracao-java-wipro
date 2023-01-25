package br.com.elraphael.seguro.modelo;

public class Caminhao extends VeiculoAutomotor {
  private int quantidadeEixos;

  public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
    super(modelo, valorMercado, anoFabricacao);
    this.quantidadeEixos = quantidadeEixos;
  }

  public int getQuantidadeEixos() {
    return quantidadeEixos;
  }

  @Override
  public double calcularValorPremio() {
    double valorPremio = getValorMercado() * 0.02;

    valorPremio += getQuantidadeEixos() * 50;

    return valorPremio;
  }

  @Override
  public String descrever() {
    return String.format("Modelo: %s%nValor de Mercado: R$%.2f%nAno fabricação: %d%nQuantidade eixos: %d%n",
        this.getModelo(), this.getValorMercado(), this.getAnoFabricacao(), this.getQuantidadeEixos());
  }
}
