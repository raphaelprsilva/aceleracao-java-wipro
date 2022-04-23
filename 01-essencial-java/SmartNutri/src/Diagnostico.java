import java.util.Scanner;

public class Diagnostico {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Avaliacao avaliacao = new Avaliacao();

    System.out.println("Digite seu peso: ");
    String pesoEntrada = scanner.next();

    System.out.println("Digite sua altura: ");
    String alturaEntrada = scanner.next();

    scanner.close();

    double peso = Double.parseDouble(pesoEntrada);
    double altura = Double.parseDouble(alturaEntrada);

    avaliacao.calcularIMC(peso, altura);
//    avaliacao.calcularIMC(61, 1.82);
  }
}
