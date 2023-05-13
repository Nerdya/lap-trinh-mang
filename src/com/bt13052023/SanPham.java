package com.bt13052023;

/**
 * @author cuongnk
 * @since 13/05/2023
 */
public class SanPham {
  private String maSP;
  private String tenSP;
  private int donGia;
  private String maLoai;

  public SanPham(String maSP, String tenSP, int donGia, String maLoai) {
    this.maSP = maSP;
    this.tenSP = tenSP;
    this.donGia = donGia;
    this.maLoai = maLoai;
  }

  public String getMaSP() {
    return maSP;
  }

  public void setMaSP(String maSP) {
    this.maSP = maSP;
  }

  public String getTenSP() {
    return tenSP;
  }

  public void setTenSP(String tenSP) {
    this.tenSP = tenSP;
  }

  public int getDonGia() {
    return donGia;
  }

  public void setDonGia(int donGia) {
    this.donGia = donGia;
  }

  public String getMaLoai() {
    return maLoai;
  }

  public void setMaLoai(String maLoai) {
    this.maLoai = maLoai;
  }
}
