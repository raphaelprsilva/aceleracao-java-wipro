package com.raphael._static;

public class ExtendedPassword extends Password {

  private final int decriptedPassword;

  public ExtendedPassword(int password) {
    super(password);
    this.decriptedPassword = password;
  }

//  @Override
//  public void storePassord() {
//    System.out.println("Salvando senha como " + this.decriptedPassword);
//  }
}
