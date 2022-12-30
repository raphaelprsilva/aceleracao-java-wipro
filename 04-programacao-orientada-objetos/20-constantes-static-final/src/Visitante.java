public class Visitante {
  static final int IDADE_MINIMA_PERMITIDA = 18;

  String nome;
  int idade;

  void definirAcesso() {
    if (this.idade < Visitante.IDADE_MINIMA_PERMITIDA) {
      System.out.printf("Acesso não permitido para menores de %d anos.%n", Visitante.IDADE_MINIMA_PERMITIDA);
    } else {
      System.out.printf("Acesso librado para %s.%n", this.nome);
    }
  }
}
