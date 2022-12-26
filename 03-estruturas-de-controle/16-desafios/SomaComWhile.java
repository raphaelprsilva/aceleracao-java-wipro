import java.util.Scanner;

public class SomaComWhile {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int somaNumeros = 0;

    while (true) {
      System.out.print("Digite um número: ");
      int numeroDigitadoPeloUsuario = entrada.nextInt();
      somaNumeros += numeroDigitadoPeloUsuario;
      System.out.printf("Soma atual: %d%n", somaNumeros);

      if (somaNumeros >= 100) break;
    }
  }
}