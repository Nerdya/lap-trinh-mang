package com.bt11042023toi.hoabinh.xemay;

import com.bt11042023toi.xeco.info.XeMay;
import java.util.Scanner;

public class XeMayHoaBinh extends XeMay {
    private int n;
    private XeMay[] xeMays;

    public XeMayHoaBinh() {
        super();
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng xe: ");
        n = scanner.nextInt();
        xeMays = new XeMay[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin xe thứ " + (i + 1) + ":");
            xeMays[i] = new XeMay();
            xeMays[i].nhap();
        }
    }

    @Override
    public void hienthi() {
        System.out.println("Thông tin xe máy tại tỉnh Hòa Bình:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin xe thứ " + (i + 1) + ":");
            xeMays[i].hienthi();
        }
    }
}
