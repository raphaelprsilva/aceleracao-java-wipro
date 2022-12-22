public class ConversaoLongToInt {
  public static void main(String[] args) {
    long x = 11;
    // int y = x;

    int y = (int) x;
    System.out.println("x = " + x);

    long myLongValue = 9600000000L;
    int myIntValue = (int) myLongValue;
    System.out.println("myLongValue = " + myLongValue);
    System.out.println("myIntValue = " + myIntValue);
  }
}