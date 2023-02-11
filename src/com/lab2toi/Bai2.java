package com.lab2toi;

import com.shared.SharedMethods;

public class Bai2 {
    static int n;
    static SharedMethods sm = new SharedMethods();

    static void printOddNumberFrom1ToN(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        System.out.println("Các số lẻ từ 1 đến " + n + ":");
        printOddNumberFrom1ToN(n);
    }
}
