package com.lab1;

import com.shared.SharedMethods;

public class Bai7 {

  static int a, b;
  static SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    a = sm.inputInt("a", "positive");
    b = sm.inputInt("b", "positive");
    System.out.println("UCLN: " + sm.gcd(a, b));
    System.out.println("BCNN: " + sm.lcm(a, b));
  }
}