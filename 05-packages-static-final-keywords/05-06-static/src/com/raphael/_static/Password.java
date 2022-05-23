package com.raphael._static;

public class Password {
  private static final int key = 748576362;
  private final int encriptedPassword;

  public Password(int password) {
    this.encriptedPassword = encriptDecript(password);
  }

  private int encriptDecript(int password) {
    return password ^ key;
  }

  public final void storePassord() {
    System.out.println("Salvando a senha como: " + this.encriptedPassword);
  }

  public boolean letMeIn(int password) {
    if (encriptDecript(password) == encriptedPassword) {
      System.out.println("Bem-vindo(a)!");
      return true;
    } else {
      System.out.println("Senha errada");
      return false;
    }
  }
}
