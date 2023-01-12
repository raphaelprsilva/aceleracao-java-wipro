package br.com.elraphael.funcionarios;

import br.com.elraphael.holerite.Holerite;

public class Funcionario {
  private String nome;
  private double valorHora;

  public Funcionario(String nome, double valorHora) {
    setNome(nome);
    setValorHora(valorHora);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    if (valorHora < 0) {
      throw new IllegalArgumentException("O valor da hora deve ser posivito");
    }
    this.valorHora = valorHora;
  }

  protected double calcularSalario(int horasTrabalhadas) {
    return this.valorHora * horasTrabalhadas;
  }

  public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
    double salario = this.calcularSalario(horasTrabalhadas);
    return new Holerite(this.getNome(), mesAno, salario);
  }

  @Override
  public String toString() {
    return "Funcionario{" +
        "nome='" + nome + '\'' +
        ", valorHora=" + valorHora +
        '}';
  }
}
