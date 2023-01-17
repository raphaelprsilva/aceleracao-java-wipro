package br.com.elraphael.impostos;

public class GestorDeImpostos {
  private double valorTotalImpostos;

  public void adicionar(Pessoa pessoa) {
    this.imprimirDadosImpostos(pessoa);
    this.valorTotalImpostos += pessoa.calcularImpostos();
  }

  private void imprimirDadosImpostos(Pessoa pessoa) {
    System.out.printf("Impostos devidos por %s: %.2f%n", pessoa.getNome(), pessoa.calcularImpostos());
  }

  public double getValorTotalImpostos() {
    return valorTotalImpostos;
  }
}
