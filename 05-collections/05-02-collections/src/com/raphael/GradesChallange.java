package com.raphael;

import java.util.Scanner;

public class GradesChallange {
  public static void main(String[] args) {
    // 1. Pedir para o usuário definir quantas notas ele vai entrar.
    // 2. Criar um laço para poder ler as notas e salvar no array.
    // 3. Calcular a média dos alunos. Criar outro laço para calcular a média.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite quantas notas você deseja inserir: ");
    int gradesQuantity = scanner.nextInt();

    double[] studentGrades = new double[gradesQuantity];

    for (int index = 0; index < studentGrades.length; index += 1) {
      System.out.print("Digite a " + (index + 1) + "ª nota: ");
      studentGrades[index] = scanner.nextDouble();
    }

    scanner.close();

    double gradesSum = 0.0;

    for (double studentGrade : studentGrades) {
      gradesSum += studentGrade;
    }

    double average = gradesSum / studentGrades.length;
    System.out.println("A média das notas dos alunos é: " + average);
  }
}
