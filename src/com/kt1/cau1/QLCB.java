package com.kt1.cau1;

import java.util.*;

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
          int position;
          System.out.print("Thêm (1. Công nhân, 2. Kỹ sư, 3. Nhân viên) ? ");
          position = Integer.parseInt(sc.nextLine());
          switch (position) {
            case 1:
              System.out.println("Thêm công nhân mới.");
              CongNhan congNhan = new CongNhan();
              congNhan.nhap();
              canBoList.add(congNhan);
              break;
            case 2:
              System.out.println("Thêm kỹ sư mới.");
              KySu kySu = new KySu();
              kySu.nhap();
              canBoList.add(kySu);
              break;
            case 3:
              System.out.println("Thêm nhân viên mới.");
              NhanVien nhanVien = new NhanVien();
              nhanVien.nhap();
              canBoList.add(nhanVien);
              break;
            default:
              System.out.println("Vị trí không hợp lệ.");
              break;
          }
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          System.out.println("Thoát chương trình...");
          break;
        default:
          System.out.println("Lựa chọn không hợp lệ.");
          break;
      }
    } while (choice != 4);
  }
}
