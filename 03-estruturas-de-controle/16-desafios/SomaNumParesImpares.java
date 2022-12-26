import java.util.Scanner;

public class SomaNumParesImpares {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int somaNumerosPares = 0;
    int somaNumerosImpares = 0;
    boolean desejaDigitarOutroNumero = true;

    do {
      System.out.print("Digite um número: ");
      int numeroDigitadoPeloUsuario = entrada.nextInt();

      if (numeroDigitadoPeloUsuario % 2 == 0) {
        somaNumerosPares += numeroDigitadoPeloUsuario;
      } else {
        somaNumerosImpares += numeroDigitadoPeloUsuario;
      }

      System.out.print("Deseja digitar outro número? (true ou false) ");
      desejaDigitarOutroNumero = entrada.nextBoolean();
    } while (desejaDigitarOutroNumero);

    System.out.printf("Soma Números Pares: %d%n", somaNumerosPares);
    System.out.printf("Soma Números Ímpares: %d%n", somaNumerosImpares);
  }
}