package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrganizedCollection {
  public static void main(String[] args) {

    // O HashSet respeita a ordem de inserção. Descomente e veja.
    // Set<String> list = new HashSet<>();

    // O TreeSet ordena os dados adicionados.
     Set<String> list = new TreeSet<>();

    list.add("Ana");
    list.add("Marcelo");
    list.add("Carlos");
    list.add("Lucca");
    list.add("Pedro");

    for (String student : list) {
      System.out.println(student);
    }
  }
}
