import java.util.ArrayList;
import java.util.Scanner;

public class SharedMethods {
    Scanner sc = new Scanner(System.in);

    String getIntException(String varName, String validator, int num) {
        String exception = "";
        switch (validator) {
            case "notZero": {
                if (num == 0) {
                    exception = varName + " != 0";
                }
                break;
            }
            case "positive": {
                if (num <= 0) {
                    exception = varName + " > 0";
                }
                break;
            }
            case "whole": {
                if (num < 0) {
                    exception = varName + " >= 0";
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
        System.out.print("\t" + arrName + "[" + index + "]: ");
        res = sc.nextInt();
        String exception = getIntException(arrName, validator, res);

        if (!exception.isEmpty()) {
            System.out.println(exception + "! Nhập lại " + arrName + ".");
            res = inputIntArrElement(index, arrName, validator);
        }
        return res;
    }

    int[] inputArrOfInt(int size, String arrName, String validator) {
        int[] arr = new int[size];
        System.out.println("Nhập các phần tử mảng " + arrName + ":");
        for (int i = 0; i < size; i++) {
            arr[i] = inputIntArrElement(i, arrName, validator);
        }
        return arr;
    }

    int[] inputArrOfInt(int size, String varName) {
        return inputArrOfInt(size, varName, "");
    }

    ArrayList<Integer> findNumberInArr(int findNum, int[] arr) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                 indexes.add(i);
            }
        }
        return indexes;
    }
}
