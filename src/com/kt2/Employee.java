package com.kt2;

/**
 * @author cuongnk
 * @since 13/05/2023
 */
public class Employee {
  private String maNV;
  private String hoTen;
  private String que;
  private float heSoLuong;

  public Employee() {}

  public Employee(String maNV, String hoTen, String que, float heSoLuong) {
    this.maNV = maNV;
    this.hoTen = hoTen;
    this.heSoLuong = heSoLuong;
    this.que = que;
  }

  public String getMaNV() {
    return maNV;
  }

  public void setMaNV(String maNV) {
    this.maNV = maNV;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getQue() {
    return que;
  }

  public void setQue(String que) {
    this.que = que;
  }

  public float getHeSoLuong() {
    return heSoLuong;
  }

  public void setHeSoLuong(float heSoLuong) {
    this.heSoLuong = heSoLuong;
  }
}
