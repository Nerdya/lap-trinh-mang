package com.lab1;

import java.util.Scanner;

public class Bai1 {
    static int i;
    static double d;
    static char ch;
    static String str;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập một số nguyên: ");
        i = sc.nextInt();
        System.out.print("Nhập một số thực: ");
        d = sc.nextDouble();
        System.out.print("Nhập một kí tự: ");
        sc.nextLine();
        ch = sc.nextLine().charAt(0);
        System.out.print("Nhập một chuỗi: ");
        str = sc.nextLine();
        System.out.println("Dữ liệu vừa nhập:");
        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("ch = " + ch);
        System.out.println("str = " + str);
    }
}