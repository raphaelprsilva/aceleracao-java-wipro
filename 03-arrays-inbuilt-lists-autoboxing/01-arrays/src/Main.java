import java.util.Scanner;

public class Main {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // Capturar valores do console, calcular a soma e a média dos valores

    int[] myIntArray = getIntegers(4);

    for (int index = 0; index < myIntArray.length; index += 1) {
      System.out.println("Posição: " + index + " ~ Valor: " + myIntArray[index]);
    }

    double arrayAvegare = getAverage(myIntArray);
    System.out.println("A média dos valores é: " + arrayAvegare);
  }

  public static int[] getIntegers(int number) {
    System.out.println("Entre com " + number + " valores inteiros:\r");
    int[] values = new int[number];

    for (int index = 0; index < values.length; index += 1) {
      values[index] = scanner.nextInt();
    }

    scanner.close();
    return values;
  }

  public static int getSum(int[] array) {
    int sum = 0;

    for (int index = 0; index < array.length; index += 1) {
      sum += array[index];
    }

    return sum;
  }

  public static double getAverage(int[] array) {
    return (double) getSum(array) / (double) array.length;
  }
}
