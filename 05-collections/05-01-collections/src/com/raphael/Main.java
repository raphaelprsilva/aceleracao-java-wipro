package com.raphael;

public class Main {

  public static void main(String[] args) {
    Theatre theatre = new Theatre("Teatro de Uberlândia", 8, 12);
    // theatre.getSeats();

    if (theatre.requestSeat("H11")) {
      System.out.println("Por favor, pague!");
    } else {
      System.out.println("Já está reservado!");
    }

    if (theatre.requestSeat("H11")) {
      System.out.println("Por favor, pague!");
    } else {
      System.out.println("Já está reservado!");
    }
  }
}
