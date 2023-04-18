package com.bt18042023toi.bai6;

import com.bt18042023toi.bai5.SinhVienPoly;

class SinhVienIT extends SinhVienPoly {
  private double diemJava;
  private double diemHtml;
  private double diemCss;

  public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss) {
    super(hoTen, nganh);
    this.diemJava = diemJava;
    this.diemHtml = diemHtml;
    this.diemCss = diemCss;
  }

  @Override
  public double getDiem() {
    return (2 * diemJava + diemHtml + diemCss) / 4;
  }
}
