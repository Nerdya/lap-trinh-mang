package com.bt11042023toi.xeco.info;

import java.util.Scanner;

public class XeMay implements IXe {
    protected String bienso;
    protected String loaixe;
    protected String mauxe;
    protected float giatien;

    public XeMay() {}

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển số: ");
        bienso = scanner.nextLine();
        System.out.print("Nhập loại xe: ");
        loaixe = scanner.nextLine();
        System.out.print("Nhập màu xe: ");
        mauxe = scanner.nextLine();
        System.out.print("Nhập giá tiền: ");
        giatien = scanner.nextFloat();
    }

    @Override
    public void hienthi() {
        System.out.println("Biển số: " + bienso);
        System.out.println("Loại xe: " + loaixe);
        System.out.println("Màu xe: " + mauxe);
        System.out.println("Giá tiền: " + giatien);
    }
}
