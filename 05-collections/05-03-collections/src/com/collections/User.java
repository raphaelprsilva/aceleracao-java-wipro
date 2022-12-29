package com.collections;

import java.util.Objects;

public class User {
  private final String name;
  private final String email;

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return name.equals(user.name) && email.equals(user.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }
}
