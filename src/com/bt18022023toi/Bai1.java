package com.bt18022023toi;

public class Bai1 {
    static int n = 4;

    static void printPyramid(int n) {
        StringBuilder sbBlank = new StringBuilder();
        StringBuilder sbStars = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbBlank.setLength(0);
            sbStars.setLength(0);
            sbBlank.append(String.valueOf(' ').repeat(n - i - 1));
            sbStars.append(String.valueOf('*').repeat(2 * i + 1));
            System.out.println(sbBlank.toString() + sbStars);
        }
    }

    public static void main(String[] args) {
        printPyramid(n);
    }
}
