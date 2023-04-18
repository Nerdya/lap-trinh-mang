package com.bt18042023toi.bai5;

public abstract class SinhVienPoly {
  String hoTen;
  String nganh;

  public SinhVienPoly(String hoTen, String nganh) {
    this.hoTen = hoTen;
    this.nganh = nganh;
  }

  public abstract double getDiem();

  public String getHocLuc() {
    if (getDiem() < 5) {
      return "Yếu";
    } else if (getDiem() <= 7) {
      return "Trung bình";
    } else if (getDiem() < 8) {
      return "Khá";
    } else {
      return "Giỏi";
    }
  }

  public void xuat() {
    System.out.println("Điểm: " + getDiem());
    System.out.println("Học lực: " + getHocLuc());
  }
}
