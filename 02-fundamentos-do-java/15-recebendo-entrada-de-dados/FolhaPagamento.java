import java.util.Scanner;

public class FolhaPagamento {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String employeeName = input.nextLine();

    System.out.print("Digite o valor pago por hora (R$): ");
    float valuePerHour = input.nextFloat();

    System.out.print("Digite a quantidade de horas trabalhadas: ");
    int workedHours = input.nextInt();

    System.out.print("Digite o valor dos descontos (R$): ");
    float discounts = input.nextFloat();

    float totalReciveable = (workedHours * valuePerHour) - discounts;

    System.out.println("-------------------------------------");
    System.out.printf("Folha de pagamento: %s%n", employeeName);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", workedHours, valuePerHour, (valuePerHour * workedHours));
    System.out.printf("Descontos: R$%.2f%n", discounts);
    System.out.printf("Total devido: R$%.2f%n", totalReciveable);

    /*
    Saída:
    Folha de pagamento: Thiago Faria
    172 horas x R$150.20 = R$25834.40
    Descontos: R$482.88
    Total devido: R$25351.52
     */
  }
}
