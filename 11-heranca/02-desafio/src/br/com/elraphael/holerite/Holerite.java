package br.com.elraphael.holerite;

import java.util.Objects;

public record Holerite(String nome, String mesAno, double valorSalario) {
  public Holerite {
    Objects.requireNonNull(nome);
    Objects.requireNonNull(mesAno);
    if (valorSalario < 0) {
      throw new IllegalArgumentException("O valor do salário deve ser positivo");
    }
  }

  public void imprimir() {
    System.out.println("----------------Holerite----------------");
    System.out.printf("Nome Funcionário: %s%n", nome());
    System.out.printf("Mês do ano: %s%n", mesAno());
    System.out.printf("Valor salário: %s%n", valorSalario());
    System.out.println("----------------------------------------");
  }
}
