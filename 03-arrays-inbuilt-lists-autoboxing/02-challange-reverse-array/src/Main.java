import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] myArray = new int[] {1, 2, 3};

    int[] myReversedArray = reverse(myArray);
  }

  public static int[] reverse(int[] arr) {
    System.out.println("Original Array = " + Arrays.toString(arr));
    int[] arrCopy = Arrays.copyOf(arr, arr.length);

    int requiredIterations = arrCopy.length / 2;

    for (int index = 0; index < requiredIterations; index += 1) {
      int leftElement = arrCopy[index];
      int rightElement = arrCopy[arrCopy.length - index - 1];
      arrCopy[index] = rightElement;
      arrCopy[arrCopy.length - index - 1] = leftElement;
    }

    System.out.println("Reversed Array = " + Arrays.toString(arrCopy));
    return arrCopy;
  }
}
