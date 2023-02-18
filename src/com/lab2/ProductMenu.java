package com.lab2;

import com.shared.SharedMethods;

public class ProductMenu {
    static int choice, n;
    static boolean hasValue = false;
    static SharedMethods sm = new SharedMethods();

    public static void inputChoice() {
        choice = sm.inputInt("lựa chọn");
        switch (choice) {
            case 1: {
                n = sm.inputInt("n", "positive");
                hasValue = true;
                inputChoice();
                break;
            }
            case 2: {
                if (!hasValue) {
                    System.out.println("Chưa nhập n! Mời bạn nhập lại.");
                    inputChoice();
                    break;
                }
                System.out.println("Tổng: 1 + ... + " + n + " = " + sm.sumOfFirstNaturalNumbers(n));
                inputChoice();
                break;
            }
            case 3: {
                if (!hasValue) {
                    System.out.println("Chưa nhập n! Mời bạn nhập lại.");
                    inputChoice();
                    break;
                }
                if (sm.isPrimeNumber(n)) {
                    System.out.println("n là số nguyên tố");
                } else {
                    System.out.println("n không là số nguyên tố");
                }
                inputChoice();
                break;
            }
            case 4: {
                if (!hasValue) {
                    System.out.println("Chưa nhập n! Mời bạn nhập lại.");
                    inputChoice();
                    break;
                }
                if (sm.isPerfectNumber(n)) {
                    System.out.println("n là số hoàn hảo");
                } else {
                    System.out.println("n không là số hoàn hảo");
                }
                inputChoice();
                break;
            }
            case 5: {
                System.out.print("Kết thúc chương trình.");
                break;
            }
            default: {
                System.out.println("Lựa chọn không hợp lê! Mời bạn nhập lại.");
                inputChoice();
                break;
            }
        }
    }

    static void menu() {
        System.out.println("1. Nhập thông tin cho n sản phẩm");
        System.out.println("2. Hiển thị thông tin vừa nhập");
        System.out.println("3. Sắp xếp thông tin giảm dần theo giá và hiển thị");
        System.out.println("4. Thoát");
        System.out.println("==================================================");
        inputChoice();
    }

    public static void main(String[] args) {
        menu();
    }
}
