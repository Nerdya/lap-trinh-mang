package com.bt18042023toi.bai6;

import com.bt18042023toi.bai5.SinhVienPoly;

class SinhVienBiz extends SinhVienPoly {
  private double diemMarketing;
  private double diemSales;

  public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
    super(hoTen, nganh);
    this.diemMarketing = diemMarketing;
    this.diemSales = diemSales;
  }

  @Override
  public double getDiem() {
    return (2 * diemMarketing + diemSales) / 3;
  }
}
