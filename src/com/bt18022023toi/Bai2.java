package com.bt18022023toi;

import com.shared.SharedMethods;

import java.util.Arrays;

public class Bai2 {

  static int n;
  static SharedMethods sm = new SharedMethods();

  static HangHoa[] nhapMangHangHoa(int n) {
    HangHoa[] hh = new HangHoa[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Hàng hóa thứ " + (i + 1));
      hh[i] = new HangHoa();
      hh[i].nhap();
    }
    return hh;
  }

  static void inMangHangHoa(HangHoa[] hh) {
    HangHoa.xuatHeader();
    for (HangHoa hangHoa : hh) {
      hangHoa.xuat();
    }
  }

  static boolean isThereMilk(HangHoa[] hh) {
    for (HangHoa hangHoa : hh) {
      if (hangHoa.getTenHang().equals("milk")) {
        return true;
      }
    }
    return false;
  }

  static void sapXepHangHoaTheoSoLuongGiamDan(HangHoa[] hh) {
    Arrays.sort(hh, (a, b) -> (b.getSoLuong() - a.getSoLuong()));
  }

  public static void main(String[] args) {
    n = sm.inputInt("n", "positive");
    HangHoa[] hh = nhapMangHangHoa(n);
    System.out.println("Danh sách các mặt hàng vừa nhập:");
    inMangHangHoa(hh);
    if (isThereMilk(hh)) {
      System.out.println("Danh sách các mặt hàng vừa nhập có mặt hàng \"milk\".");
    } else {
      System.out.println("Danh sách các mặt hàng vừa nhập không có mặt hàng \"milk\".");
    }
    sapXepHangHoaTheoSoLuongGiamDan(hh);
    System.out.println("Danh sách các mặt hàng sắp xếp theo số lượng giảm dần:");
    inMangHangHoa(hh);
  }
}
