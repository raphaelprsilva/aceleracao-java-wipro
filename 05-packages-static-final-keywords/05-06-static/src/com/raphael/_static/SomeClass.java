package com.raphael._static;

public class SomeClass {

  private static int classCounter = 0;
  public final int instanceNumber;
  private final String name;

  public SomeClass(String name) {
    this.name = name;
    classCounter += 1;
    instanceNumber = classCounter;
    System.out.println(name + " criado, a instância é " + instanceNumber);
  }

  public int getInstanceNumber() {
    return instanceNumber;
  }
}
