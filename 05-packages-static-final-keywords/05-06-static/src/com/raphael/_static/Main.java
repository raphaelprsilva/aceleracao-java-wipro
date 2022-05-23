package com.raphael._static;

public class Main {

  public static int multiplier = 7;

  public static void main(String[] args) {
//    StaticTest firstInstance = new StaticTest("Primeira instância");
//    System.out.println(firstInstance.getName() + " é a " + StaticTest.getNumInstances() + "ª instancia da classe.");
//
//    StaticTest secondInstance = new StaticTest("Segunda instância");
//    System.out.println(secondInstance.getName() + " é a " + StaticTest.getNumInstances() + "ª instância da classe.");
//
//    StaticTest thirdInstance = new StaticTest("Terceira instância");
//    System.out.println(thirdInstance.getName() + " é a " + StaticTest.getNumInstances() + "ª instância da classe.");
//
//    int answer = multiply(3);
//    System.out.println("Answer = " + answer);

//    SomeClass one = new SomeClass("one");
//    SomeClass two = new SomeClass("two");
//    SomeClass three = new SomeClass("three");
//
//    System.out.println(one.getInstanceNumber());;
//    System.out.println(two.getInstanceNumber());
//    System.out.println(three.getInstanceNumber());

    Password password = new ExtendedPassword(12345);
    password.storePassord();
    password.letMeIn(123);
    password.letMeIn(1234);
    password.letMeIn(12345);
  }

  public static int multiply(int number) {
    return number * multiplier;
  }
}
