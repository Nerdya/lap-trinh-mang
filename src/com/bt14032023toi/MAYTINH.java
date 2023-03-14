package com.bt14032023toi;

public class MAYTINH extends QLH {
    private Integer tgbh;

    public MAYTINH() {
    }

    public MAYTINH(Integer maHang, String tenHang, String xuatXu, Integer loaiHang, Integer soLuong, Integer tgbh) {
        super(maHang, tenHang, xuatXu, loaiHang, soLuong);
        this.tgbh = tgbh;
    }

    public Integer getTgbh() {
        return tgbh;
    }

    public void setTgbh(Integer tgbh) {
        this.tgbh = tgbh;
    }

    public void input() {

    }

    public void print() {

    }
}
