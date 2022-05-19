package com.series;

public class Series {
  public Series() {}

  public static int nSum(int n) {
    return (n * (n + 1)) / 2;
  }

  public static long fatorial(int n) {
    long sum = 1;

    if (n == 0) {
      return 1;
    }

    for (int index = 1; index <= n; index += 1) {
      sum *= index;
    }

    return sum;
  }

  public static int fibonnaci(int n) {
    if (n < 2) {
      return n;
    } else {
      return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
  }
}
