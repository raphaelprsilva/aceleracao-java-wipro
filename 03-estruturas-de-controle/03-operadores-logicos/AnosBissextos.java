import java.util.Scanner;

public class AnosBissextos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um ano (AAAA): ");
    int userInputYear = input.nextInt();

    boolean isMultipleOf400 = (userInputYear % 400) == 0 ? true : false;
    boolean isMultipleOf4 = (userInputYear % 4) == 0 ? true : false;
    boolean isNotMultipleOf100 = (userInputYear % 100) != 0 ? true : false;
    boolean isLeapYear = isMultipleOf400 || (isMultipleOf4 && isNotMultipleOf100);
    String message = isLeapYear ? "É um ano bissexto!" : "Não é um ano bissexto!";

    System.out.println(message);
  }
}