package com.raphael;

public class X {
  private int x;

  public X(int x) {
    this.x = x;
  }

  public void x() {
    for (int x = 1; x < 13; x += 1) {
      System.out.println(this.x + " multiplicado por " + x + " é igual a " + (this.x * x));
    }
  }
}
