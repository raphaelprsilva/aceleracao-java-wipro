package com.raphael;

public class Main {

  public static void main(String[] args) {
    Account raphaAccount = new Account("Raphael Silva");

    raphaAccount.deposit(100);
    raphaAccount.withdraw(80);
    raphaAccount.calculateBalance();
  }
}
