package com.lab4;

public class Bai1 {

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.input();
    System.out.println("Hình chữ nhật vừa nhập:");
    r1.print();
    System.out.printf("Chu vi hình chữ nhật: %.2f", r1.getPerimeter());
    System.out.printf("Diện tích hình chữ nhật: %.2f", r1.getArea());
  }
}
