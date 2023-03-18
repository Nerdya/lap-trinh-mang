package com.lab1;

import com.shared.SharedMethods;

public class Bai18 {

  static int[][] arr2D;
  static SharedMethods sm = new SharedMethods();

  static int[][] initIntArray2D(int rows, int columns) {
    int[][] arr2D = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arr2D[i][j] = i * 10 + j;
      }
    }
    return arr2D;
  }

  public static void main(String[] args) {
    arr2D = initIntArray2D(5, 10);
    sm.printIntArray2D(arr2D);
  }
}
