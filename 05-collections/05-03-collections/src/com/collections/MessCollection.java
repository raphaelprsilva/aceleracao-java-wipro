package com.collections;

import java.util.HashSet;
import java.util.Set;

public class MessCollection {
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) {

    HashSet collection = new HashSet();

    collection.add(1.2); // double -> Double
    collection.add(true);
    collection.add('A');
    collection.add(1);
    collection.add("teste");

    System.out.println("Tamanho da collection: " + collection.size());

    // Não aceita adicionar itens repetidos
    collection.add(true);
    System.out.println("Tamanho da collection: " + collection.size());

    // Removendo itens
    collection.remove("Teste"); // retorna "false" pois não existe esse elemento na collection
    collection.remove("teste"); // retorna "true", pois o elemento existe na collection
    System.out.println("Tamanho da collection: " + collection.size());

    Set numbers = new HashSet();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    System.out.println("collection: " + collection);
    System.out.println("numbers: " + numbers);

    collection.addAll(numbers);
    System.out.println("collection: " + collection);
  }
}
