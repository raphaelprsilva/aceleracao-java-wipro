import java.util.Scanner;

public class PesoAeronave {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe o peso máximo permitido na aeronave: ");
    int pesoMaximoAeronave = entrada.nextInt();

    boolean incluirPassageiro = true;
    int pesoTotalPassageiros = 0;
    int passageiroAtual = 1;

    while (incluirPassageiro) {
      System.out.printf("Peso passageiro %d: ", passageiroAtual);
      int pesoPassageiroAtual = entrada.nextInt();
      pesoTotalPassageiros += pesoPassageiroAtual;

      if (pesoTotalPassageiros > pesoMaximoAeronave) {
        incluirPassageiro = false;
      } else {
        System.out.printf("Incluir próximo passageiro? (true ou false): ");
        incluirPassageiro = entrada.nextBoolean();
        passageiroAtual += 1;
      }
    }

    String mensagemPermissaoVoo = (pesoTotalPassageiros > pesoMaximoAeronave) ? "Não pode voar" : "Bom voo";

    System.out.println("---------------------------------------------------");
    System.out.printf("Peso máximo permitido na aeronave: %d kgs %n", pesoMaximoAeronave);
    System.out.printf("Peso total dos passageiros: %d kgs%n", pesoTotalPassageiros);
    System.out.println(mensagemPermissaoVoo);
  }
}