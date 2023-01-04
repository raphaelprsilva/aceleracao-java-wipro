import java.util.Objects;

public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  String nome;
  int quantidadeEstoque;

  Produto() {
    this("Sem nome");
  }

  Produto(String nome) {
    this(nome, QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE);
  }

  Produto(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "O nome do produto é obrigatório.");

    if (this.quantidadeEstoque < 0) {
      throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa");
    }

    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
  }
}