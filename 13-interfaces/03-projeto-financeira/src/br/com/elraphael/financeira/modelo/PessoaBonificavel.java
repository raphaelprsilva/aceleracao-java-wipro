package br.com.elraphael.financeira.modelo;

public interface PessoaBonificavel extends ClienteFinanciavel {

  double calcularBonus(double percentualMetaAlcancada);
}
