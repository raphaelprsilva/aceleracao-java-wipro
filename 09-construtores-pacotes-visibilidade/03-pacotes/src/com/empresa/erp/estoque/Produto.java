package com.empresa.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  final String codigo;
  String nome;
  int quantidadeEstoque;

  public Produto() {
    this("Sem nome");
  }

  public Produto(String nome) {
    this(nome, QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE);
  }

  public Produto(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "O nome do produto é obrigatório.");

    if (this.quantidadeEstoque < 0) {
      throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa");
    }

    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
    this.codigo = UUID.randomUUID().toString();
  }

  void imprimirInformacoes() {
    System.out.printf("Nome: %s%n", this.nome);
    System.out.printf("Quantidade Estoque: %d%n", this.quantidadeEstoque);
    System.out.printf("Código com.empresa.erp.estoque.Produto: %s%n", this.codigo);
  }
}