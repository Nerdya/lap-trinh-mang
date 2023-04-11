package com.bt11042023toi.quanlychung.xemay;

import com.bt11042023toi.hoabinh.xemay.XeMayHoaBinh;
import com.bt11042023toi.hanoi.xemay.XeMayHaNoi;
import java.util.Scanner;

public class QuanLyChung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        XeMayHoaBinh xeMayHoaBinh = new XeMayHoaBinh();
        XeMayHaNoi xeMayHaNoi = new XeMayHaNoi();
        int choice;

        do {
            System.out.println("1. Nhập thông tin cho n xe máy tại tỉnh Hòa Bình.");
            System.out.println("2. Nhập thông tin cho n xe máy tại tỉnh Hà Nội.");
            System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
            System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
            System.out.println("5. Thống kê số lượng xe đang quản lý.");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    xeMayHoaBinh.nhap();
                    break;
                case 2:
                    xeMayHaNoi.nhap();
                    break;
                case 3:
                    // Sắp xếp danh sách tăng theo biển số xe.
                    // (Bạn cần viết hàm sắp xếp cho đối tượng XeMayHoaBinh và XeMayHaNoi)
                    break;
                case 4:
                    // Tìm kiếm thông tin xe theo biển số xe.
                    // (Bạn cần viết hàm tìm kiếm cho đối tượng XeMayHoaBinh và XeMayHaNoi)
                    break;
                case 5:
                    // Thống kê số lượng xe đang quản lý.
                    System.out.println("Số lượng xe máy tại tỉnh Hòa Bình: " /* Số lượng xe Hòa Bình */);
                    System.out.println("Số lượng xe máy tại tỉnh Hà Nội: " /* Số lượng xe Hà Nội */);
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }
}
