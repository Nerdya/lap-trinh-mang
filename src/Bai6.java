import java.util.Objects;
import java.util.Scanner;

public class Bai6 {
    static int choice, n;
    static boolean hasValue = false;
    public static final Scanner sc = new Scanner(System.in);
    public static int inputInt(String varName, String arguments) {
        int i;
        System.out.print("Nhập " + varName + ": ");
        i = sc.nextInt();

        if (Objects.equals(arguments, "positive") && i <= 0) {
            System.out.println(varName + " > 0 ! Nhập lại " + varName + ".");
            i = inputInt(varName, arguments);
        }
        return i;
    }

    public static int inputInt(String varName) {
        return inputInt(varName, "");
    }

    public static int sum(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static boolean checkPrimeNumber(int n) {
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean checkPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void inputChoice() {
        choice = inputInt("lựa chọn");
        switch (choice) {
            case 1: {
                n = inputInt("n", "positive");
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
                System.out.println("Tổng: 1 + ... + " + n + " = " + sum(n));
                inputChoice();
                break;
            }
            case 3: {
                if (!hasValue) {
                    System.out.println("Chưa nhập n! Mời bạn nhập lại.");
                    inputChoice();
                    break;
                }
                if (checkPrimeNumber(n)) {
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
                if (checkPerfectNumber(n)) {
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

    public static void menu() {
        System.out.println("1. Nhập vào một số nguyên dương n");
        System.out.println("2. Tính tổng các số từ 1 đến n");
        System.out.println("3. Kiểm tra n có là số nguyên tố");
        System.out.println("4. Kiểm tra n có là số hoàn hảo");
        System.out.println("5. Thoát");
        System.out.println("=================================");
        inputChoice();
    }
    public static void main(String[] args) {
        menu();
    }
}