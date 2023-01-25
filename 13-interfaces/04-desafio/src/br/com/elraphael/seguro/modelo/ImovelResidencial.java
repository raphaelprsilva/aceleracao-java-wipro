package br.com.elraphael.seguro.modelo;

public class ImovelResidencial implements BemSeguravel {
  private double valorMercado;
  private int areaConstruida;

  public ImovelResidencial(double valorMercado, int areaConstruida) {
    this.valorMercado = valorMercado;
    this.areaConstruida = areaConstruida;
  }

  public double getValorMercado() {
    return valorMercado;
  }

  public int getAreaConstruida() {
    return areaConstruida;
  }

  @Override
  public double calcularValorPremio() {
    double valorPremio = getValorMercado() * 0.001;
    valorPremio += getAreaConstruida() * 0.3;

    return valorPremio;
  }

  @Override
  public String descrever() {
    return String.format("Valor Mercado: %.2f%nÁrea Construída: %d%n", getValorMercado(), getAreaConstruida());
  }
}
