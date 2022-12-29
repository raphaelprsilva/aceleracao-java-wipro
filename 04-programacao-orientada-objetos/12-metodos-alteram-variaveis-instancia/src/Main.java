public class Main {
  public static void main(String[] args) {
    Aeronave aeronave = new Aeronave();
    aeronave.totalAssentos = 100;

    // para desativar o avião, eu poderia fazer assim
    // aeronave.ativo = false;

    // mas isso se tornaria contraprodutivo ao longo do tempo
    // então, podemos criar um método para ter tal ação
    aeronave.desativar();

    // ativando a areonave
    aeronave.ativar();

    // reservando um assento
    aeronave.reservarAssentos(10);

    System.out.printf("Aeronave Ativa: %b%n", aeronave.ativo);
    System.out.printf("Assentos disponíveis: %d%n", aeronave.calculaAssentosDisponiveis());
  }
}
