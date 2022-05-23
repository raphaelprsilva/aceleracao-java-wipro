package com.raphael;

import java.util.ArrayList;

public class Account {
  private String accountName;
  private int balance = 0;
  private ArrayList<Integer> transactions;

  public Account(String accountName) {
    this.accountName = accountName;
    this.transactions = new ArrayList<Integer>();
  }

  public int getBalance() {
    return this.balance;
  }

  public void deposit(int value) {
    if (value > 0) {
      transactions.add(value);
      this.balance += value;
      System.out.println("Valor depositado: " + value + " -- Saldo atual: " + this.balance);
    } else {
      System.out.println("Não é possível fazer depósitos de valores negativos.");
    }
  }

  public void withdraw(int value) {
    int withdrawValue = -value;

    if (withdrawValue < 0) {
      if (getBalance() < value) {
        System.out.println("Saldo insuficiente.");
        return;
      }

      transactions.add(withdrawValue);
      this.balance += withdrawValue;
      System.out.println("Valor sacado: " + value + " -- Saldo atual: " + this.balance);
    } else {
      System.out.println("Não é possível sacar valores negativos.");
    }
  }

  public void calculateBalance() {
    this.balance = 0;

    for (int transaction : this.transactions) {
      this.balance += transaction;
    }

    System.out.println("Seu saldo atual é: " + this.balance);
  }
}
