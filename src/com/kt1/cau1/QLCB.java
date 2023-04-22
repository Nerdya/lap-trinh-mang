package com.kt1.cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
  public static void main(String[] args) {
    List<CanBo> canBoList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      System.out.print(
          "1. Nhập thông tin mới cho cán bộ\n" +
          "2. Tìm kiếm theo họ tên\n" +
          "3. Hiển thị thông tin về danh sách các cán bộ\n" +
          "4. Thoát khỏi chương trình\n" +
          "Nhập lựa chọn: "
      );
      choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 1:

          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        default:
          System.out.println("Lựa chọn không hợp lệ.");
          break;
      }
    } while (choice != 4);
  }
}
