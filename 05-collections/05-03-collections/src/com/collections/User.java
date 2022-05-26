package com.collections;

import java.util.Objects;

public class User {
  private final String name;
  private final String email;

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof User) {
      User anotherUser = (User) obj;

      boolean isNameEqual = anotherUser.name.equals(this.name);
      boolean isEmailEqual = anotherUser.email.equals(this.email);

      return isEmailEqual && isNameEqual;
    } else {
      return false;
    }
  }
}
