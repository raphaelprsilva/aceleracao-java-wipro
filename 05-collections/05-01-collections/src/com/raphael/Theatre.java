package com.raphael;

import java.util.Collection;
import java.util.HashSet;

public class Theatre {
  private final String theatreName;
  private Collection<Seat> seats = new HashSet<>();

  public Theatre(String theatreName, int numRows, int seatsPerRow) {
    this.theatreName = theatreName;

    // o tipo 'char' é como se fosse um 'int', por isso não obteremos erro
    int lastRow = 'A' + (numRows - 1);
    // System.out.println(lastRow);

    for (char row = 'A'; row <= lastRow; row+= 1) {
      for (int seatNum = 1; seatNum <= seatsPerRow; seatNum += 1) {
        Seat seat = new Seat(row + String.format("%02d", seatNum));
        seats.add(seat);
      }
    }
  }

  public String getTheatreName() {
    return theatreName;
  }

  public boolean requestSeat(String seatNumber) {
    Seat requestedSeat = null;

    for (Seat seat : seats) {
      if (seat.getSeatNumber().equals(seatNumber)) {
        requestedSeat = seat;
        break;
      }
    }

    if (requestedSeat == null) {
      System.out.println("Não existe poltrona com o número " + seatNumber + " vazia.");
      return false;
    }

    return requestedSeat.reserve();
  }

  public void getSeats() {
    for (Seat seat : seats) {
      System.out.println(seat.getSeatNumber());
    }
  }


  private class Seat {
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
      this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
      return this.seatNumber;
    }

    public boolean reserve() {
      if (!this.reserved) {
        this.reserved = true;
        System.out.println("Poltrona " + this.seatNumber + " foi reservada.");
        return true;
      } else {
        return false;
      }
    }

    public boolean cancel() {
      if (this.reserved) {
        this.reserved = false;
        System.out.println("A poltrona " + this.seatNumber + " está liberada!");
        return true;
      } else {
        return false;
      }
    }
  }
}
