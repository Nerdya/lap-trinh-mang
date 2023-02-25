package com.lab4;

import com.shared.SharedMethods;

public class Rectangle {
    private float a;
    private float b;

    public Rectangle() {
    }

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    static SharedMethods sm = new SharedMethods();

    public void input() {
        a = sm.inputFloat("cạnh a", "positive");
        b = sm.inputFloat("cạnh b", "positive");
        sm.sc.nextLine();
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)\n", a, b);
    }

    public float getPerimeter() {
        return (a + b) * 2;
    }

    public float getArea() {
        return a * b;
    }
}
