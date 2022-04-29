import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int myIntValue = 10;
    int anotherIntValue = myIntValue;

    System.out.println("myIntValue: " + myIntValue);
    System.out.println("anotherIntValue: " + anotherIntValue);

    anotherIntValue++;

    System.out.println("myIntValue: " + myIntValue);
    System.out.println("anotherIntValue: " + anotherIntValue);

    // Arrays são tipos de referência
    // No caso, `myIntArray` é uma referência ao array na memória
    int[] myIntArray = new int[5];
    int[] anotherIntArray = myIntArray;


    System.out.println("myIntArray = " + Arrays.toString(myIntArray));
    System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

    anotherIntArray[1] = 3;

    System.out.println("------------------------------------------");
    System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
    System.out.println("after change anotherIntArray = " + Arrays.toString(anotherIntArray));

    anotherIntArray = new int[] {34, 43, 12, 45, 46};
    modifyArray(myIntArray);

    System.out.println("------------------------------------------");
    System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
    System.out.println("after modify anotherIntArray = " + Arrays.toString(anotherIntArray));
  }

  private static void modifyArray(int[] array) {
    array[0] = 2;
    array = new int[] {1, 2, 3, 4, 5};
  }
}
