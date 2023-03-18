package com.lab1;

import java.util.Scanner;

public class Bai2 {

  static int a, b;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Nhập số nguyên a: ");
    a = sc.nextInt();
    System.out.print("Nhập số nguyên b: ");
    b = sc.nextInt();
    System.out.println("Max: " + Math.max(a, b));
    System.out.println("Min: " + Math.min(a, b));
  }
}