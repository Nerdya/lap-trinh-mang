package com.Lab1;

import com.SharedMethods;

public class Bai16 {
    static String str;
    static SharedMethods sm = new SharedMethods();
    public static void main(String[] args) {
        str = sm.inputString("xâu");
        System.out.println("Xâu được chuẩn hóa:");
        System.out.println(sm.normalizeString(str));
    }
}
