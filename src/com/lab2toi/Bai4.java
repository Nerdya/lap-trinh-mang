package com.lab2toi;

import com.shared.SharedMethods;

public class Bai4 {
    static int n;
    static SharedMethods sm = new SharedMethods();

    static int getReverseNumberByForLoop(int n) {
        int reverse = 0;
        int lastDigit;
        for (; n != 0; n /= 10) {
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
        }
        return reverse;
    }

    static int getReverseNumberByWhileLoop(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        System.out.print("Số đảo ngược sử dụng vòng lặp for: " + getReverseNumberByForLoop(n) + "\n");
        System.out.print("Số đảo ngược sử dụng vòng lặp while: " + getReverseNumberByWhileLoop(n) + "\n");
    }
}
