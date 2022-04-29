import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int[] myArray = getIntegers(6);
    int[] sortedArray = sortIntegers(myArray);
    printArray(sortedArray);
  }

  public static int[] getIntegers(int arraySize) {
    int[] array = new int[arraySize];
    System.out.println("Digite " + arraySize + " números para serem inseridos no array: ");

    for (int index = 0; index < array.length; index += 1) {
      array[index] = scanner.nextInt();
    }

    return array;
  }

  public static void printArray(int[] array) {
    System.out.println("array: " + Arrays.toString(array));
  }

  public static int[] sortIntegers(int[] array) {
    // 1ª maneira de fazer uma cópia do array original (comentado)
    // int[] sortedArray = new int[array.length];

    // Faz uma cópia do array original
    // for (int i = 0; i < array.length; i += 1) {
    //  sortedArray[i] = array[i];
    // }

    // 2ª maneira de fazer uma cópia do array original
    int[] sortedArray = Arrays.copyOf(array, array.length);

    for (int i = 0; i < sortedArray.length; i += 1) {
      for (int j = 0; j < sortedArray.length - i - 1; j += 1) {
        if (sortedArray[j] < sortedArray[j + 1]) {
          int temp = sortedArray[j];
          sortedArray[j] = sortedArray[j + 1];
          sortedArray[j + 1] = temp;
        }
      }
    }

    return sortedArray;
  }
}
