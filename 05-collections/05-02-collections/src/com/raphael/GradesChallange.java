package com.raphael;

import java.util.Arrays;
import java.util.Scanner;

public class GradesChallange {
  public static void main(String[] args) {
    // 1. Pedir para o usuário definir quantos alunos irão ter notas.
    // 1. Pedir para o usuário definir quantas notas ele vai entrar.
    // 2. Criar um laço para poder ler as notas e salvar no array.
    // 3. Calcular a média dos alunos. Criar outro laço para calcular a média.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantidade de alunos: ");
    int studentsQuantity = scanner.nextInt();

    System.out.print("Digite quantas notas você deseja inserir: ");
    int gradesQuantity = scanner.nextInt();

    double[][] studentGrades = new double[studentsQuantity][gradesQuantity];

    double gradesSum = 0.0;

    for (int i = 0; i < studentGrades.length; i += 1) {
      System.out.println("Aluno " + (i + 1));

      for (int j = 0; j < gradesQuantity; j += 1) {
        System.out.print("Digite a " + (j + 1) + "ª nota: ");
        studentGrades[i][j] = scanner.nextDouble();
        gradesSum += studentGrades[i][j];
      }
    }

    scanner.close();

    double average = gradesSum / (studentsQuantity + gradesQuantity);
    System.out.println("A média das notas dos alunos é: " + average);

    for (double[] studentGrade : studentGrades) {
      System.out.println(Arrays.toString(studentGrade));
    }
  }
}
