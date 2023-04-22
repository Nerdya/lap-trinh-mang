package com.kt1.cau1;

import java.util.Scanner;

public class CanBo {
  private String hoTen;
  private int namSinh;
  private String gioiTinh;
  private String diaChi;

  public CanBo() {
  }

  public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi) {
    this.hoTen = hoTen;
    this.namSinh = namSinh;
    this.gioiTinh = gioiTinh;
    this.diaChi = diaChi;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public int getNamSinh() {
    return namSinh;
  }

  public void setNamSinh(int namSinh) {
    this.namSinh = namSinh;
  }

  public String getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập họ tên: ");
    setHoTen(sc.nextLine());
    System.out.print("Nhập năm sinh: ");
    setNamSinh(Integer.parseInt(sc.nextLine()));
    System.out.print("Nhập giới tính: ");
    setGioiTinh(sc.nextLine());
    System.out.print("Nhập địa chỉ: ");
    setDiaChi(sc.nextLine());
  }

  public void hienThi() {
    System.out.println("Họ tên: " + getHoTen());
    System.out.println("Năm sinh: " + getNamSinh());
    System.out.println("Giới tính: " + getGioiTinh());
    System.out.println("Địa chỉ: " + getDiaChi());
  }
}
