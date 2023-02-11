package com.lab2toi;

import com.shared.SharedMethods;

public class Bai5 {
    static int n;
    static SharedMethods sm = new SharedMethods();

    static void printNumberDigitsAndItsIndex(int n) {
        int digit;
        int length = String.valueOf(n).length();
        for (int i = length - 1; i >= 0; i--) {
            digit = n % 10;
            System.out.println("Vị trí số " + (i + 1) + " là: " + digit);
            n /= 10;
        }
    }

    public static void main(String[] args) {
        n = sm.inputInt("số cần tách", "positive");
        printNumberDigitsAndItsIndex(n);
    }
}
