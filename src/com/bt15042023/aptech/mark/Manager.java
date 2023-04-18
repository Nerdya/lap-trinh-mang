package com.bt15042023.aptech.mark;

import java.util.Scanner;

/**
 * @author cuongnk
 * @since 15/04/2023
 */
public class Manager {

  public static void main(String[] args) {
    System.out.println("1. Nhập thông tin n sinh viên Aptech.\n"
        + "2. Nhập m điểm thi cho các sinh viên này\n"
        + "3. Sắp xếp sinh viên theo tên và hiển thị\n"
        + "4. Tìm thông tin điểm thi theo id của sinh viên\n"
        + "5. Exit\n");
    System.out.println("Nhập lựa chọn: ");
    Scanner sc = new Scanner(System.in);
    int choice = Integer.parseInt(sc.nextLine());
  }
}
