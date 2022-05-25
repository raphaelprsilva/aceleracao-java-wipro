package com.raphael;

import java.util.Arrays;

public class ForLoop {
  public static void main(String[] args) {
    double[] studentsGrade = new double[3];

    System.out.println("Printing before set values to array");
    System.out.println(Arrays.toString(studentsGrade));

    studentsGrade[0] = 2.3;
    studentsGrade[1] = 8;
    studentsGrade[2] = 8.7;

    System.out.println("Printing after set values to array");
    System.out.println(Arrays.toString(studentsGrade));

    // looping through array
    double total = 0;
    for (int index = 0; index < studentsGrade.length; index += 1) {
      total += studentsGrade[index];
    }

    System.out.println("Student average: " + (total / studentsGrade.length));
  }
}
