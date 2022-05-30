package com.collections;

import java.util.ArrayList;

public class List {
  public static void main(String[] args) {
    ArrayList<User> users = new ArrayList<>();

    User rapha = new User("Raphael", "rapha@email.com");
    User joana = new User("Joana", "joana@email.com");
    User marcos = new User("Marcos", "marcos@email.com");

    users.add(rapha);
    users.add(joana);
    users.add(marcos);

    System.out.println("users.get(1).getName() = " + users.get(1).getName());
    System.out.println(users.remove(2));

    for (User user : users) {
      System.out.println(user.getName());
    }
  }
}
