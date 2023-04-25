package com.bt25042023toi;

import com.bt08042023.manager.info.ManagerStudent;
import java.util.Scanner;

/**
 * @author cuongnk
 * @since 08/04/2023
 */
public class UsingManagerStudent {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ManagerStudent mn = new ManagerStudent();
    int n;
    do {
      System.out.println("1. Input data");
      System.out.println("2. Display data");
      System.out.println("3. Sort by name");
      System.out.println("4. Search by name");
      System.out.println("5. Exit");
      System.out.print("Nhập lựa chọn: ");
      n = Integer.parseInt(sc.nextLine());
      switch (n) {
        case 1:
          mn.input();
          break;
        case 2:
          mn.display();
          break;
        case 3:
          mn.sort();
          break;
        case 4:
          mn.searchByName();
          break;
        default:
          break;
      }
    } while (n != 5);
  }
}
