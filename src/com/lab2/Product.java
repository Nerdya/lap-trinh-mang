package com.lab2;

import com.shared.SharedMethods;

public class Product {
    private String tenHangHoa;
    private String nhaSanXuat;
    private float giaBan;

    public Product(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public Product() {
        this.tenHangHoa = "";
        this.nhaSanXuat = "";
        this.giaBan = 0;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    static SharedMethods sm = new SharedMethods();

    void input() {
        this.tenHangHoa = sm.inputString("tên hàng hóa");
        sm.sc.nextLine();
        this.nhaSanXuat = sm.inputString("nhà sản xuất");
        this.giaBan = sm.inputFloat("giá bán", "whole");
    }

    void print() {
        System.out.println("Tên hàng hóa: " + this.tenHangHoa);
        System.out.println("Nhà sản xuất: " + this.nhaSanXuat);
        System.out.println("Giá bán: " + this.giaBan);
    }
}
