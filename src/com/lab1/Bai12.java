package com.lab1;

import com.shared.SharedMethods;

public class Bai12 {
    static int n;
    static int[] arr;
    static SharedMethods sm = new SharedMethods();

    static void printPrimeNumberInIntArray(int[] arr) {
        for (int e : arr) {
            if (sm.isPrimeNumber((e))) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    static void printPerfectNumberInIntArray(int[] arr) {
        for (int e : arr) {
            if (sm.isPerfectNumber((e))) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    static void printEvenNumberInIntArray(int[] arr) {
        for (int e : arr) {
            if (e % 2 == 0) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        arr = sm.inputIntArray(n, "D");
        System.out.println("Các số nguyên tố trong mảng D:");
        printPrimeNumberInIntArray(arr);
        System.out.println("Các số hoàn hảo trong mảng D:");
        printPerfectNumberInIntArray(arr);
        System.out.println("Các số chẵn trong mảng D:");
        printEvenNumberInIntArray(arr);
    }
}
