import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] array = readIntegers(5);
    System.out.println("array: " + Arrays.toString(array));
    int minimum = findMin(array);
    System.out.println("Minimum value = " + minimum);
  }

  public static int[] readIntegers(int count) {
    System.out.println("Digite " + count + " números para serem inseridos no array.");
    int[] array = new int[count];

    for (int index = 0; index < count; index += 1) {
      System.out.println("Digite o " + (index + 1) + "º número inteiro: ");
      array[index] = scanner.nextInt();
    }

    return array;
  }

  public static int findMin(int[] array) {
    int minimum = array[0];

    for (int index = 0; index < array.length; index += 1) {
      if (array[index] < minimum) {
        minimum = array[index];
      }
    }

    return minimum;
  }
}
