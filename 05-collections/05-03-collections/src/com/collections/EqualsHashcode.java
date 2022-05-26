package com.collections;

public class EqualsHashcode {
  public static void main(String[] args) {

    User user1 = new User("raphael", "raphael@email.com");
    User user2 = new User("raphael", "raphael@email.com");

    System.out.println(user1 == user2);
    System.out.println(user1.equals(user2));
  }
}
