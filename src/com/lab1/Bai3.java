package com.lab1;

import com.shared.SharedMethods;

public class Bai3 {

  static int a, b, c, delta;
  static SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    a = sm.inputInt("a", "notZero");
    b = sm.inputInt("b");
    c = sm.inputInt("c");
    delta = b * b - 4 * a * c;
    if (delta < 0) {
      System.out.println("PT vô nghiệm");
    } else if (delta == 0) {
      float x = (float) -b / (2 * a);
      System.out.printf("PT có nghiệm kép x1 = x2 = %.2f", x);
    } else {
      float x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
      float x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
      System.out.println("PT có 2 nghiệm phân biệt:");
      System.out.printf("\tx1 = %.2f\n", x1);
      System.out.printf("\tx2 = %.2f\n", x2);
    }
  }
}
