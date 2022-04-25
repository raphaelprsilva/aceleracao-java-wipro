public class Main {
  public static void main(String[] args) {
    Caminhao volks = new Caminhao("abc-123", "Raphael", "Prata");

    System.out.println("Placa do caminhão: " + volks.getPlaca());

    System.out.println("-------------------------------------");
    Porta porta = new Porta();
    porta.abrePorta();
    porta.fecharPorta();
    porta.fecharPorta();
    System.out.println("-------------------------------------");
    PortaSegura portaSegura = new PortaSegura("Minha Chave");

  }
}
