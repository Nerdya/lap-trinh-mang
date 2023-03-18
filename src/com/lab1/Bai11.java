package com.lab1;

import com.shared.SharedMethods;
import java.util.ArrayList;

public class Bai11 {

  static int n, x;
  static ArrayList<Integer> arrList;
  static SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    n = sm.inputInt("n", "positive");
    arrList = sm.inputIntArrayList(n, "C");
    x = sm.inputInt("phần tử cần xóa x");
    sm.deleteNumberInIntArrayList(arrList, x);
    System.out.println("Danh sách phần tử trong mảng C sau khi xóa:");
    sm.printIntArrayList(arrList);
  }
}
