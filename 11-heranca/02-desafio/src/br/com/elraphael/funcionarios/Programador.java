package br.com.elraphael.funcionarios;

public class Programador extends Funcionario {
  private double valorBonus;

  public Programador(String nome, double valorHora) {
    super(nome, valorHora);
  }

  public double getValorBonus() {
    return valorBonus;
  }

  public void setValorBonus(double valorBonus) {
    if (valorBonus < 0) {
      throw new IllegalArgumentException("O valor do bônus deve ser positivo");
    }
    this.valorBonus = valorBonus;
  }

  @Override
  protected double calcularSalario(int horasTrabalhadas) {
    return super.calcularSalario(horasTrabalhadas) + this.getValorBonus();
  }

  @Override
  public String toString() {
    return "Programador{" +
        "nome" + this.getNome() +
        ",valorHora" + this.getValorHora() +
        ",valorBonus=" + valorBonus +
        '}';
  }
}
