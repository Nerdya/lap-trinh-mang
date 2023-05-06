package com.bt06052023;

/**
 * @author cuongnk
 * @since 24/04/2023
 */

public class Student {
  private String maSinhVien;
  private String hoTen;
  private String gioiTinh;
  private String soDienThoai;
  private int tuoi;

  public Student(String maSinhVien, String hoTen, String gioiTinh, String soDienThoai, int tuoi) {
    this.maSinhVien = maSinhVien;
    this.hoTen = hoTen;
    this.gioiTinh = gioiTinh;
    this.soDienThoai = soDienThoai;
    this.tuoi = tuoi;
  }

  public String getMaSinhVien() {
    return maSinhVien;
  }

  public void setMaSinhVien(String maSinhVien) {
    this.maSinhVien = maSinhVien;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public String getSoDienThoai() {
    return soDienThoai;
  }

  public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
}
