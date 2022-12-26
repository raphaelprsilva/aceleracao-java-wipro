import java.util.Scanner;

public class NumerosPrimos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número inteiro positivo e maior que zero: ");
    int numeroDigitadoPeloUsuario = entrada.nextInt();

    int contadorDeDivisiveis = 0;

    for (int index = 1; index <= numeroDigitadoPeloUsuario; index += 1) {
      if (numeroDigitadoPeloUsuario % index == 0) {
        contadorDeDivisiveis += 1;
      }
    }

    String ehPrimo = contadorDeDivisiveis == 2 ? "É primo" : "Não é primo";
    System.out.println(ehPrimo);
  }
}