import java.util.Scanner;

public class CalculadoraImc {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe seu sexo:");
    System.out.print("Digite '1' para mulher, '2' para homem: ");
    int sexoUsuario = entrada.nextInt();

    System.out.print("Digite seu peso (kg): ");
    float peso = entrada.nextFloat();

    System.out.print("Digite sua altura (metros): ");
    float altura = entrada.nextFloat();

    float IMC = peso / (altura * altura);

    boolean ehMulher = sexoUsuario == 1;
    boolean ehHomem = sexoUsuario == 2;

    if (ehHomem) {
      if (IMC < 20.7) {
        System.out.printf("Seu IMC é: %.2f. Classificação: Abaixo do peso%n", IMC);
      } else if (IMC < 26.4) {
        System.out.printf("Seu IMC é: %.2f. Classificação: No peso ideal%n", IMC);
      } else if (IMC < 27.8) {
        System.out.printf("Seu IMC é: %.2f. Classificação: Um pouco acima do peso%n", IMC);
      } else if (IMC < 31.1) {
        System.out.printf("Seu IMC é: %.2f. Classificação: Acima do peso ideal%n", IMC);
      } else {
        System.out.printf("Seu IMC é: %.2f. Classificação: Obeso%n", IMC);
      }
    } else if (ehMulher) {
      if (IMC < 19.1) {
        System.out.printf("Seu IMC é: %.2f. Classificação: Abaixo do peso%n", IMC);
      } else if (IMC < 25.8) {
        System.out.printf("Seu IMC é: %.2f. Classificação: No peso ideal%n", IMC);
      } else if (IMC < 27.3) {
        System.out.printf("Seu IMC é: %.2f. Classificação: Um pouco acima do peso%n", IMC);
      } else if (IMC < 32.3) {
        System.out.printf("Seu IMC é: %.2f. Classificação: Acima do peso ideal%n", IMC);
      } else {
        System.out.printf("Seu IMC é: %.2f. Classificação: Obeso%n", IMC);
      }
    } else {
      System.out.println("Você digitou o valor errado.%n");
    }
  }
}