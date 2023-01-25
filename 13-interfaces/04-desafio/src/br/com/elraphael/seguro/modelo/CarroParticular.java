package br.com.elraphael.seguro.modelo;

public class CarroParticular extends VeiculoAutomotor {

  public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
    super(modelo, valorMercado, anoFabricacao);
  }

  @Override
  public double calcularValorPremio() {
    double valorPremio = this.getValorMercado() * 0.04;

    if (this.getAnoFabricacao() < 2000) {
      valorPremio *= 1.05;
    }

    return valorPremio;
  }

  @Override
  public String descrever() {
    return String.format("Modelo: %s%nValor de Mercado: R$%.2f%nAno fabricação: %d%n",
        this.getModelo(), this.getValorMercado(), this.getAnoFabricacao());
  }
}
