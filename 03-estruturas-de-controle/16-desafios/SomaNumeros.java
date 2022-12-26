import java.util.Scanner;

public class SomaNumeros {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String todosOsNumeros = "";

    System.out.println("Digite 10 números (devem ser pares)");

    for (int index = 1; index <= 10; index += 1) {
      System.out.printf("Número %d/%d: ", index, 10);
      int numeroDigitado = entrada.nextInt();

      if (numeroDigitado % 2 != 0) {
        continue;
      } else {
        todosOsNumeros += numeroDigitado + " ";
      }
    }

    System.out.printf("Todos os números pares: %s%n", todosOsNumeros);
  }
}