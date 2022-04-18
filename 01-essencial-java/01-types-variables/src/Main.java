public class Main {
  public static void main(String[] args) {
    // byte type
    byte b = 9;
    System.out.println("----byte type----");
    System.out.println("b = " + b);

    // short type
    short num = 308;
    short formatedWithUnderscore = 30_000;
    System.out.println("----short type----");
    System.out.println("num = " + num);
    System.out.println("formatedWithUnderscore = " + formatedWithUnderscore);

    // int type
    int intNumber = 10;
    int x = 10, y = 20, soma; // inicializando variáveis inline
    soma = x + y;
    System.out.println("----int type----");
    System.out.println("intNumber = " + intNumber);
    System.out.println("soma = " + soma);

    // long type
    long numA = 102040;
    long numB = 102030405060L; // o 'L' indica que é uma variável do tipo 'long'
    System.out.println("----long type----");
    System.out.println("numA = " + numA);
    System.out.println("numB = " + numB);

    // float type
    System.out.println("----float type----");
    float numC = -101.23f; // o 'f' explicita que é um float type
    float numD = 2.345f;
    System.out.println("numC + numD = " + (numC + numD));

    // double type
    System.out.println("----double type----");
    double varDouble = 2.345; // double inicializado naturalmente
    double doubleReceivingFloat = 3.4534F; // double aceitando float
    double doubleReceivingLong = 12340L; // double aceitando long
    System.out.println("varDouble = " + varDouble);
    System.out.println("doubleReceivingFloat = " + doubleReceivingFloat);
    System.out.println("doubleReceivingLong = " + doubleReceivingLong);

    // char type
    System.out.println("----char type----");
    char myChar = 'c';
    char myChar2 = 'C';
    System.out.println("myChar == myChar2 ? " + (myChar == myChar2));

    System.out.println("----boolean type----");
    boolean isFriday = false;
    boolean isValid = true;
    System.out.println("isFriday = " + isFriday);
    System.out.println("isValid = " + isValid);

    System.out.println("----String type----");
    String vamos = "Vamos";
    String aprender = " aprender";
    String java = " Java?";

    String frase = vamos + aprender + java;
    System.out.println("frase: " + frase);
  }
}
