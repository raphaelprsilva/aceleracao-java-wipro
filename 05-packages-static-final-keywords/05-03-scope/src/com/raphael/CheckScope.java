package com.raphael;

public class CheckScope {
  public int publicVar = 0;
  private int varOne = 1;

  public CheckScope() {
    System.out.println("Scopo criado. publicVar = " + publicVar + ". privateVar = " + varOne);
  }

  public int getVarOne() {
    return varOne;
  }

  public void timesTwo() {
    int varTwo = 2;
    for (int index = 0; index <= 10; index += 1) {
      System.out.println(index + " vezes " + varTwo + " é igual a " + index * 2);
    }
  }

  public class InnerClass {
    private int var3 = 3;

    public InnerClass() {
      System.out.println("InnerClass tem uma variável privada. Ela é: " + var3);
    }

    public void timesTwo() {
      int privateVar = 2;

      for (int index = 0; index <= 10; index += 1) {
        System.out.println(index + " vezes " + privateVar + " é igual a " + index * 2);
      }
    }
  }
}
