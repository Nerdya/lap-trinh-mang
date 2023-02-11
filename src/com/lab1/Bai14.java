package com.lab1;

import com.shared.SharedMethods;

public class Bai14 {
    static int n;
    static int[] memo;
    static SharedMethods sm = new SharedMethods();

    static int fibonacciMemoization(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] == 0) {
            memo[n] = fibonacciMemoization(n - 1, memo) + fibonacciMemoization(n - 2, memo);
        }

        return memo[n];
    }

    static void printPrimeFibonacciSmallerThan(int n, int[] memo) {
        for (int e : memo) {
            if (sm.isPrimeNumber(e) && e < n) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        n = sm.inputInt("n", "whole");
        memo = new int[n + 1];
        if (n >= 1) {
            memo[1] = 1;
        }
        System.out.println("Số Fibonacci thứ " + n + ":");
        System.out.println(fibonacciMemoization(n, memo));
        System.out.println("Các số Fibonacci nhỏ hơn n và là số nguyên tố:");
        printPrimeFibonacciSmallerThan(n, memo);
        System.out.println(memo[0] + " " + memo[1] + " " + memo[2]);
    }
}
