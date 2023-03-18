package com.lab8;

import com.shared.SharedMethods;
import java.util.ArrayList;

public class Test {

  public static SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    int n = sm.inputInt("n", "positive");
    System.out.println();
    ArrayList<UnetiBook> unetiBooks = new ArrayList<>();
  }
}
