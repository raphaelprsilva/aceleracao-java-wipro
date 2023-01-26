package br.com.elraphael.locadora;

public interface Precificacao {
  double calcularValorTotal(Notebook notebook, int horasUtilizadas);
}
