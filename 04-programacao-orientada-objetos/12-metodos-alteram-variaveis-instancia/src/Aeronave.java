public class Aeronave {
  boolean ativo = true;
  int totalAssentos;
  int assentosReservados;

  int calculaAssentosDisponiveis() {
    return totalAssentos - assentosReservados;
  }

  void reservarAssentos(int quantidadeAssentosReserva) {
    int quantidadeDeAssentosDisponiveis = calculaAssentosDisponiveis();
    boolean existemAssentosSuficientes = quantidadeDeAssentosDisponiveis >= quantidadeAssentosReserva;
    if (ativo && existemAssentosSuficientes) {
      assentosReservados += quantidadeAssentosReserva;
    } else {
      // existe uma maneira melhor de fazer isso, que seria lançar uma exceção
      // mas não estudamos isso
      System.out.println("Aeronave desativada ou não existem suficientes.");
    }
  }

  void desativar() {
    ativo = false;
  }

  void ativar() {
    ativo = true;
  }
}
