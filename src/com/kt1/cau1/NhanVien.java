package com.kt1.cau1;

import java.util.Scanner;

public class NhanVien extends CanBo {
  private String congViec;

  public NhanVien() {
  }

  public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
    super(hoTen, namSinh, gioiTinh, diaChi);
    this.congViec = congViec;
  }

  public String getCongViec() {
    return congViec;
  }

  public void setCongViec(String congViec) {
    this.congViec = congViec;
  }

  public void nhap() {
    super.nhap();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập công việc: ");
    setCongViec(sc.nextLine());
  }

  public void hienThi() {
    super.hienThi();
    System.out.println("Công việc: " + getCongViec());
  }
}
