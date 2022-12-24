import java.util.Scanner;

public class ExameCortisol {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o nível do seu cortisol: ");
    double userCortisol = input.nextDouble();

    double minLevelIdealCortisol = 6;
    double maxLevelIdealCortisol = 18.4;

    boolean isUserCortisolIdeal = userCortisol >= minLevelIdealCortisol && userCortisol <= maxLevelIdealCortisol;
    String message = isUserCortisolIdeal ? "dentro dos limites aceitáveis" : "fora dos limites aceitáveis";
    System.out.printf("O seu cortisol está %s%n", message);
  }
}