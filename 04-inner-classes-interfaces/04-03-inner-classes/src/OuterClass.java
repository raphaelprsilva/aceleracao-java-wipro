public class OuterClass {
  int outerNumber = 6;

  public void heyThere() {
    System.out.println("Hey there!");

    class LocalInnerClass {
      String localInnerClassVariable = "Hey Jude";

      public void printLocalInnerClassVariable() {
        System.out.println(localInnerClassVariable);
      }
    }

    LocalInnerClass lic = new LocalInnerClass();
    lic.printLocalInnerClassVariable();
  }

  public static class InnerClass {
    int innerNumber = 8;

    public void whatsUp() {
      System.out.println("What's up from Inner Class");
    }
  }
}
