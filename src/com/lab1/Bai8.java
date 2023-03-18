package com.lab1;

import com.shared.SharedMethods;

public class Bai8 {

  static int n;
  static SharedMethods sm = new SharedMethods();

  static void printPrimeNumber(int n) {
    System.out.println("Các số nguyên tố từ 1 đến " + n + ":");
    for (int i = 2; i <= n; i++) {
      if (sm.isPrimeNumber(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    n = sm.inputInt("n", "whole");
    if (sm.isPrimeNumber(n)) {
      System.out.println("n là số nguyên tố");
    } else {
      System.out.println("n không là số nguyên tố");
    }
    printPrimeNumber(n);
  }
}