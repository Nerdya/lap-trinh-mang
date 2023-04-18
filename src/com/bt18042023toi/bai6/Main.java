package com.bt18042023toi.bai6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      quanLySinhVien.menu();
      System.out.print("Nhập lựa chọn của bạn: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          quanLySinhVien.nhap();
          break;
        case 2:
          quanLySinhVien.xuat();
          break;
        case 3:
          quanLySinhVien.xuatGioi();
          break;
        case 4:
          quanLySinhVien.sapXep();
          System.out.println("Danh sách sau khi sắp xếp:");
          quanLySinhVien.xuat();
          break;
        case 5:
          System.out.println("Kết thúc chương trình.");
          return;
        default:
          System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
      }
    }
  }
}
