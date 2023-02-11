package com.Lab1;

import com.SharedMethods;

public class Bai17 {
    static int rows, columns;
    static int[][] arr2D;
    static SharedMethods sm = new SharedMethods();
    public static void main(String[] args) {
        rows = sm.inputInt("số hàng", "positive");
        columns = sm.inputInt("số cột", "positive");
        arr2D = sm.inputIntArray2D(rows, columns, "A2");
        System.out.println("Mảng 2 chiều vừa nhập:");
        sm.printIntArray2D(arr2D);
    }
}
