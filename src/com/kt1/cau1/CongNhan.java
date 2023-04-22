package com.kt1.cau1;

import java.util.Scanner;

public class CongNhan extends CanBo {
  private String bac;

  public CongNhan() {
  }

  public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, String bac) {
    super(hoTen, namSinh, gioiTinh, diaChi);
    this.bac = bac;
  }

  public String getBac() {
    return bac;
  }

  public void setBac(String bac) {
    this.bac = bac;
  }

  public void nhap() {
    super.nhap();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập bậc: ");
    setBac(sc.nextLine());
  }

  public void hienThi() {
    super.hienThi();
    System.out.println("Bậc: " + getBac());
  }
}
