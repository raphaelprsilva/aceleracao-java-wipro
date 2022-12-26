import java.util.Scanner;

public class InverteNumeros {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numeroDigitadoPeloUsuario = entrada.nextInt();

    int resto = 0;
    int restante = 0;
    int numeroInvertido = 0;
    int indice = 0;

    while (true) {
      resto = numeroDigitadoPeloUsuario % 10;
      numeroInvertido = numeroInvertido * 10 + resto;
      restante = numeroDigitadoPeloUsuario / 10;
      numeroDigitadoPeloUsuario = restante;

      if (restante == 0) break;
    }

    System.out.printf("Número invertido: %d%n", numeroInvertido);
  }
}