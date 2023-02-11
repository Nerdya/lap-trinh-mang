package com.lab1;

import com.shared.SharedMethods;

public class Bai4 {
    static int soDien, tienDien;
    static SharedMethods sm = new SharedMethods();

    public static void main(String[] args) {
        soDien = sm.inputInt("số điện");

        if (soDien <= 50) {
            tienDien = soDien * 5000;
        } else {
            tienDien = 50 * 5000 + (soDien - 50) * 1200;
        }
        System.out.println("Tiền điện của tháng là: " + tienDien);
    }
}