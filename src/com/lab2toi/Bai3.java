package com.lab2toi;

import com.shared.SharedMethods;

public class Bai3 {
    static int n;
    static SharedMethods sm = new SharedMethods();

    static void printFirstNPrimeNumbers(int n) {
        int count = 0;
        int number = 2;
        while (count < n) {
            if (sm.isPrimeNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        System.out.println(n + " số nguyên tố đầu tiên:");
        printFirstNPrimeNumbers(n);
    }
}
