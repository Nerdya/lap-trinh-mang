package com.bt18022023toi;

import com.shared.SharedMethods;

public class HangHoa {
    String maHang;
    String tenHang;
    int donGia;
    int soLuong;

    public HangHoa() {
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    static SharedMethods sm = new SharedMethods();

    public void nhap() {
        maHang = sm.inputString("mã hàng");
        tenHang = sm.inputString("tên hàng");
        donGia = sm.inputInt("đơn giá", "whole");
        soLuong = sm.inputInt("số lượng", "whole");
        sm.sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-10s%-30s%10d%10d%12d\n", maHang, tenHang, donGia, soLuong, donGia * soLuong);
    }

    static public void xuatHeader() {
        System.out.printf("%-10s%-30s%10s%10s%12s\n", "Mã hàng", "Tên hàng", "Đơn giá", "Số lượng", "Thành tiền");
    }
}
