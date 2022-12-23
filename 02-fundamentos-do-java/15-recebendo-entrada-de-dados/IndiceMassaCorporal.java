import java.util.Scanner;

public class IndiceMassaCorporal {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Digite sua massa (kg): ");
    float userBodyMass = userInput.nextFloat();

    System.out.print("Digite sua altura (metros): ");
    float userHeight = userInput.nextFloat();

    float BMI = userBodyMass / (userHeight * userHeight);
    System.out.printf("Seu IMC é: %.2f%n", BMI);
  }
}