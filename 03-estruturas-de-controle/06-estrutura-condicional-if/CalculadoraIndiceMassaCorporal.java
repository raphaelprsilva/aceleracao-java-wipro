import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite seu peso (kg): ");
    float peso = entrada.nextFloat();

    System.out.print("Digite sua altura (metros): ");
    float altura = entrada.nextFloat();

    float imc = peso / (altura * altura);

    boolean estaAbaixoDoPesoIdeal = imc < 18.5;
    boolean estaNoPesoIdeal = imc >= 18.5 && imc < 25;
    boolean estaAcimaDoPeso = imc >= 25 && imc < 30;
    boolean obesidadeGrauI = imc >= 30 && imc < 35;
    boolean obesidadeGrauII = imc >= 35 && imc < 40;
    boolean obesidadeGrauIII = imc >= 40;

    if (estaAbaixoDoPesoIdeal) {
      System.out.printf("Seu IMC é: %.2f%n", imc);
      System.out.println("Abaixo do peso ideal.");
    }
    if (estaNoPesoIdeal) {
      System.out.printf("Seu IMC é: %.2f%n", imc);
      System.out.println("Peso ideal");
    }
    if (estaAcimaDoPeso) {
      System.out.printf("Seu IMC é: %.2f%n", imc);
      System.out.println("Acima do peso");
    }
    if (obesidadeGrauI) {
      System.out.printf("Seu IMC é: %.2f%n", imc);
      System.out.println("Obesidade de Grau I");
    }
    if (obesidadeGrauII) {
      System.out.printf("Seu IMC é: %.2f%n", imc);
      System.out.println("Obesidade de Grau II");
    }
    if (obesidadeGrauIII) {
      System.out.printf("Seu IMC é: %.2f%n", imc);
      System.out.println("Obesidade de Grau III");
    }
  }
}