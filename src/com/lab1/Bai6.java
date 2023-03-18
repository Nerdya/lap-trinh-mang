package com.lab1;

import com.shared.SharedMethods;

public class Bai6 {

  static int choice, n;
  static boolean hasValue = false;
  static SharedMethods sm = new SharedMethods();

  public static void inputChoice() {
    choice = sm.inputInt("lựa chọn");
    switch (choice) {
      case 1: {
        n = sm.inputInt("n", "positive");
        hasValue = true;
        inputChoice();
        break;
      }
      case 2: {
        if (!hasValue) {
          System.out.println("Chưa nhập n! Mời bạn nhập lại.");
          inputChoice();
          break;
        }
        System.out.println("Tổng: 1 + ... + " + n + " = " + sm.sumOfFirstNaturalNumbers(n));
        inputChoice();
        break;
      }
      case 3: {
        if (!hasValue) {
          System.out.println("Chưa nhập n! Mời bạn nhập lại.");
          inputChoice();
          break;
        }
        if (sm.isPrimeNumber(n)) {
          System.out.println("n là số nguyên tố");
        } else {
          System.out.println("n không là số nguyên tố");
        }
        inputChoice();
        break;
      }
      case 4: {
        if (!hasValue) {
          System.out.println("Chưa nhập n! Mời bạn nhập lại.");
          inputChoice();
          break;
        }
        if (sm.isPerfectNumber(n)) {
          System.out.println("n là số hoàn hảo");
        } else {
          System.out.println("n không là số hoàn hảo");
        }
        inputChoice();
        break;
      }
      case 5: {
        System.out.print("Kết thúc chương trình.");
        break;
      }
      default: {
        System.out.println("Lựa chọn không hợp lê! Mời bạn nhập lại.");
        inputChoice();
        break;
      }
    }
  }

  public static void menu() {
    System.out.println("1. Nhập vào một số nguyên dương n");
    System.out.println("2. Tính tổng các số từ 1 đến n");
    System.out.println("3. Kiểm tra n có là số nguyên tố");
    System.out.println("4. Kiểm tra n có là số hoàn hảo");
    System.out.println("5. Thoát");
    System.out.println("=================================");
    inputChoice();
  }

  public static void main(String[] args) {
    menu();
  }
}