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

    System.out.println("----String Builder----");
    // É uma classe, ou seja, ela precisa ser instanciada e pode ser usada para concatenar 'strings'
    StringBuilder stringBuilder = new StringBuilder();
    String estou = "Estou ";
    String aprendendo = "aprendendo ";
    String javaLang = "linguagem Java";

    StringBuilder minhaNovaFrase = stringBuilder.append(estou).append(aprendendo).append(javaLang);
    System.out.println("minhaNovaFrase: " + minhaNovaFrase);

    StringBuilder novaFrase = stringBuilder.replace(4, 5, "y");
    System.out.println("novaFrase: " + novaFrase);

    System.out.println("----Arrays----");
    double[] arrayDoubles = new double[3];
    arrayDoubles[0] = 200.00;
    arrayDoubles[1] = 934.12;
    arrayDoubles[2] = 43.4232;
    System.out.println("arrayDoubles[1]: " + arrayDoubles[1]);
    System.out.println("arrayDoubles[2]: " + arrayDoubles[2]);

    System.out.println("----Arrays de Arrays----");
    String[] stringArray = {"na Trybe!", "Partiu ", "Jaa ", "aprender "}; // Array de Strings
    int[][] matriz = new int[2][3]; // Inicializando uma matriz
    int[] arrayDeInteiros = {10, 20, 30}; // Array de 'int'

    matriz[0][0] = 10;
    matriz[1][0] = 20;
    System.out.println("matriz[0][0] = " + matriz[0][0]);
    System.out.println("matriz[1][0] = " + matriz[1][0]);
    System.out.println("matriz.length = " + matriz.length);
  }
}
