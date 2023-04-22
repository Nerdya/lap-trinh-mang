package com.kt1.cau1;

import java.util.Scanner;

public class KySu extends CanBo {
  private String nganhDaoTao;

  public KySu() {
  }

  public KySu(String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
    super(hoTen, namSinh, gioiTinh, diaChi);
    this.nganhDaoTao = nganhDaoTao;
  }

  public String getNganhDaoTao() {
    return nganhDaoTao;
  }

  public void setNganhDaoTao(String nganhDaoTao) {
    this.nganhDaoTao = nganhDaoTao;
  }

  public void nhap() {
    super.nhap();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập ngành đào tạo: ");
    setNganhDaoTao(sc.nextLine());
  }

  public void hienThi() {
    super.hienThi();
    System.out.println("Ngành đào tạo: " + getNganhDaoTao());
  }
}
