import java.util.Scanner;

public class CalculaPrecoProduto {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Qual o preço do produto? ");
    float productPrice = input.nextFloat();

    System.out.print("Vai ter frete? ('true' ou 'false'): ");
    boolean hasShipping = input.nextBoolean();

    float shipping = 0;

    if (hasShipping) {
      System.out.print("Valor do Frete: ");
      shipping = input.nextFloat();
    }

    float finalPrice = productPrice + shipping;
    System.out.printf("O preço final do produto é: %.2f%n", finalPrice);
  }
}