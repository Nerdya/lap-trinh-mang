package com.lab1;

import com.shared.SharedMethods;

public class Bai13 {

  static int n;
  static int[] arr;
  static SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    n = sm.inputInt("n", "positive");
    arr = sm.inputIntArray(n, "E");
    sm.optimizedInsertionSort(arr);
    System.out.println("Mảng E sau khi sắp xếp:");
    sm.printIntArray(arr);
  }
}
