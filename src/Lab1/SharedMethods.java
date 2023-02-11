package Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SharedMethods {
    Scanner sc = new Scanner(System.in);

    String getIntException(String varName, String validator, int value) {
        String exception = "";
        switch (validator) {
            case "notZero": {
                if (value == 0) {
                    exception = varName + " != 0";
                }
                break;
            }
            case "positive": {
                if (value <= 0) {
                    exception = varName + " > 0";
                }
                break;
            }
            case "whole": {
                if (value < 0) {
                    exception = varName + " >= 0";
                }
                break;
            }
            case "1..99": {
                if (value < 1 || value > 99) {
                    exception = "0 < " + varName + " < 100";
                }
                break;
            }
        }
        return exception;
    }
    int inputInt(String varName, String validator) {
        int res;
        System.out.print("Nhập " + varName + ": ");
        res = sc.nextInt();
        String exception = getIntException(varName, validator, res);

        if (!exception.isEmpty()) {
            System.out.println(exception + "! Nhập lại " + varName + ".");
            res = inputInt(varName, validator);
        }
        return res;
    }

    int inputInt(String varName) {
        return inputInt(varName, "");
    }

    int sumOfFirstNaturalNumbers(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    boolean checkPrimeNumber(int n) {
        boolean res = true;
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    boolean checkPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    int gcd(int a, int b)
    {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    int inputIntArrElement(int index, String arrName, String validator) {
        int res;
        String elementName = arrName + "[" + index + "]";
        System.out.print(elementName + ": ");
        res = sc.nextInt();
        String exception = getIntException(elementName, validator, res);

        if (!exception.isEmpty()) {
            System.out.println(exception + "! Nhập lại " + elementName + ".");
            res = inputIntArrElement(index, arrName, validator);
        }
        return res;
    }

    int[] inputIntArray(int size, String arrName, String validator) {
        int[] arr = new int[size];
        System.out.println("Nhập các phần tử mảng " + arrName + ":");
        for (int i = 0; i < size; i++) {
            arr[i] = inputIntArrElement(i, arrName, validator);
        }
        return arr;
    }

    int[] inputIntArray(int size, String arrName) {
        return inputIntArray(size, arrName, "");
    }

    int[] inputIntArrayUntilNthElement(int size, String arrName, String validator, int n) {
        int[] arr = new int[size];
        System.out.println("Nhập các phần tử mảng " + arrName + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = inputIntArrElement(i, arrName, validator);
        }
        return arr;
    }

    ArrayList<Integer> getIndexesOfFindNumberInIntArray(int[] arr, int findValue) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (findValue == arr[i]) {
                 indexes.add(i);
            }
        }
        return indexes;
    }

    void printIntArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    void printIntArrayUntilNElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    ArrayList<Integer> inputIntArrayList(int size, String arrName) {
        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println("Nhập các phần tử mảng " + arrName + ":");
        for (int i = 0; i < size; i++) {
            int element = inputIntArrElement(i, arrName, "");
            arrList.add(element);
        }
        return arrList;
    }

    void deleteNumberInIntArrayList(ArrayList<Integer> arrList, int deleteValue) {
        arrList.removeAll(Collections.singleton(deleteValue));
    }

    void printIntArrayList(ArrayList<Integer> arrList) {
        arrList.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    void optimizedInsertionSort(int[] arr, SortOrder order) {
        int n = arr.length;

        // Find the minimum element
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        // Place the minimum element at the first position
        int temp = arr[0];
        arr[0] = arr[index];
        arr[index] = temp;

        // Insertion sort with sentinel values and stop the loop early optimization
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && (order == SortOrder.ASCENDING ? arr[j] > key : arr[j] < key)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            if (j != i - 1) {
                arr[j + 1] = key;
            }
        }
    }

    void optimizedInsertionSort(int[] arr) {
        optimizedInsertionSort(arr, SortOrder.ASCENDING);
    }

    void insertIntoSortedArray(int[] arr, int value) {
        int i;
        for (i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < value) {
                arr[i + 1] = arr[i];
            } else {
                break;
            }
        }
        arr[i + 1] = value;
    }

    String inputString(String varName) {
        String input;
        System.out.print("Nhập " + varName + ": ");
        input = sc.nextLine();
        return input;
    }

    String normalizeString(String input) {
        input = input.trim().toLowerCase();
        String[] words = input.split("\\s+");
        StringBuilder normalized = new StringBuilder();
        for (String word : words) {
            normalized.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1)).append(" ");
        }
        return normalized.toString().trim();
    }

    int inputIntArr2DElement(int index, String arrName, String validator) {
        int res;
        String elementName = arrName + "[" + index + "]";
        System.out.print(elementName + ": ");
        res = sc.nextInt();
        String exception = getIntException(elementName, validator, res);

        if (!exception.isEmpty()) {
            System.out.println(exception + "! Nhập lại " + elementName + ".");
            res = inputIntArrElement(index, arrName, validator);
        }
        return res;
    }

    int[][] inputIntArray2D(int rows, int columns, String arrName, String validator) {
        int[][] arr2D = new int[rows][columns];
        System.out.println("Nhập mảng 2 chiều " + arrName + ":");
        return arr2D;
    }

    int[][] inputIntArray2D(int rows, int columns, String arrName) {
        return inputIntArray2D(rows, columns, arrName, "");
    }
}
