package com.bt18022023toi;

import com.shared.SharedMethods;

import java.util.Arrays;

public class Bai3 {

  static int m, n;
  static int[] arr1, arr2;
  static SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    m = sm.inputInt("m", "positive");
    n = sm.inputInt("n", "positive");
    arr1 = sm.inputIntArray(m, "A");
    arr2 = sm.inputIntArray(n, "B");
    int[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
    System.out.println("Mảng sau khi nối:");
    sm.printIntArray(result);
  }
}
