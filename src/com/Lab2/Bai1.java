package com.Lab2;

public class Bai1 {

    public static void main(String[] args) {
        StudentMark s1 = new StudentMark();
        StudentMark s2 = new StudentMark();
        System.out.println("Nhập thông tin học sinh thứ 1:");
        s1.input();
        System.out.println("Nhập thông tin học sinh thứ 2:");
        s2.input();
        System.out.println("Thông tin học sinh thứ 1:");
        s1.print();
        System.out.println("Thông tin học sinh thứ 2:");
        s2.print();
        System.out.println("Thông tin của người có điểm cao nhất:");
        if (s1.getMark() >= s2.getMark()) {
            s1.print();
        } else {
            s2.print();
        }
    }
}
