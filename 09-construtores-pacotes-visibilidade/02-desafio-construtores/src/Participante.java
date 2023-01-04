import java.util.Objects;

public class Participante {
  static final int SALDO_INICIAL_PADRAO = 0;

  String nome;
  int saldoDePontos;

  Participante(String nome) {
    this(nome, SALDO_INICIAL_PADRAO);
  }

  Participante(String nome, int saldoDePontosInicial) {
    Objects.requireNonNull(nome, "O nome deve ser informado");

    if (saldoDePontosInicial < 0) {
      throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
    }

    this.nome = nome;
    this.saldoDePontos = saldoDePontosInicial;
  }

  void imprimirDados() {
    System.out.printf("Nome: %s%n", this.nome);
    System.out.printf("Saldo de Pontos: %d%n", this.saldoDePontos);
  }
}
