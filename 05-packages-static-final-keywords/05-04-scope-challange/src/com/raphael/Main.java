package com.raphael;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int myInt = scanner.nextInt();

    X x = new X(myInt);

    x.x();
  }
}
