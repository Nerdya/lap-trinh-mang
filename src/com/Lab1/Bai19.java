package com.Lab1;

import com.SharedMethods;

public class Bai19 {
    static int[][] arr2D = {
        {60, 55, 70},
        {80, 60, 41}
    };
    static SharedMethods sm = new SharedMethods();
    public static void main(String[] args) {
        System.out.printf("Điểm trung bình của học sinh 1: %.2f\n",
            sm.getAverageOfRowInIntArray2D(arr2D, 0));
        System.out.printf("Điểm trung bình của học sinh 2: %.2f\n",
            sm.getAverageOfRowInIntArray2D(arr2D, 1));
    }
}
