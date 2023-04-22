package com.kt1.cau1;

import java.util.*;

public class QLCB {
  public static void main(String[] args) {
    List<CanBo> canBoList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      System.out.print(
          "---------------------Menu--------------------\n" +
          "1. Nhập thông tin mới cho cán bộ\n" +
          "2. Tìm kiếm theo họ tên\n" +
          "3. Hiển thị thông tin về danh sách các cán bộ\n" +
          "4. Thoát khỏi chương trình\n" +
          "---------------------------------------------\n" +
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
          String hoTen;
          boolean found = false;
          CanBo canBoCanTim = new CanBo();
          System.out.print("Nhập họ tên cần tìm kiếm: ");
          hoTen = sc.nextLine();
          for (CanBo canBo : canBoList) {
            if (canBo.getHoTen().equals(hoTen)) {
              found = true;
              canBoCanTim = canBo;
            }
          }
          if (found) {
            System.out.println("Thông tin cán bộ cần tìm: ");
            canBoCanTim.hienThi();
          } else {
            System.out.println("Không tìm thấy cán bộ với họ tên " + hoTen);
          }
          break;
        case 3:
          System.out.println("Thông tin danh sách các cán bộ: ");
          for (CanBo canBo : canBoList) {
            canBo.hienThi();
            System.out.println();
          }
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
