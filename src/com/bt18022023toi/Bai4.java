package com.bt18022023toi;

import com.shared.SharedMethods;

public class Bai4 {
    static int x;
    static int[] arr;
    static SharedMethods sm = new SharedMethods();

    static int[] inputIntArrElementsUntil0() {
        int[] arr = new int[100];
        int i = 0;
        do {
            arr[i] = sm.inputInt("số nguyên");
            i++;
        } while (arr[i - 1] != 0 && i < 100);
        return arr;
    }

    static int sumOfIntArr(int[] arr) {
        int result = 0;
        for (int e : arr) {
            result += e;
        }
        return result;
    }

    static int arrayMax(int[] arr) {
        int result = arr[0];
        for (int e : arr) {
            if (result < e) {
                result = e;
            }
        }
        return result;
    }

    static int arrayMaxSmallerThanKey(int[] arr, int key) {
        int result = arr[0];
        for (int e : arr) {
            if (result < e && result < key) {
                result = e;
            }
        }
        return result;
    }

    static void indexesOfGivenNumberInIntArray(int x, int[] arr) {
        System.out.println("Vị trí của các số " + x + ":");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        arr = inputIntArrElementsUntil0();
        sm.printIntArray(arr);
        System.out.println("Tổng các số vừa nhập: " + sumOfIntArr(arr));
        System.out.println("Số lớn thứ 2 trong dãy vừa nhập: " + arrayMaxSmallerThanKey(arr, arrayMax(arr)));
        x = sm.inputInt("x");
        indexesOfGivenNumberInIntArray(x, arr);
    }
}
