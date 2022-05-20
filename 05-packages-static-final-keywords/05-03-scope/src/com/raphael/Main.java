package com.raphael;

public class Main {

  public static void main(String[] args) {
    String privateVar = "Esta é a variável privateVar do main()";

    CheckScope instanceScope = new CheckScope();
    System.out.println("privateVar da classe ChceckScope: " + instanceScope.getVarOne());
    System.out.println(privateVar);

    instanceScope.timesTwo();
    System.out.println("-------------------------------");
    CheckScope.InnerClass innerClass = instanceScope.new InnerClass();
    innerClass.timesTwo();
  }
}
