import java.util.Objects;
import java.util.Scanner;

public class SharedMethods {
    Scanner sc = new Scanner(System.in);
    int inputInt(String varName, String arguments) {
        int i;
        System.out.print("Nhập " + varName + ": ");
        i = sc.nextInt();

        if (Objects.equals(arguments, "notZero") && i == 0) {
            System.out.println(varName + " != 0 ! Nhập lại " + varName + ".");
            i = inputInt(varName, arguments);
        }

        if (Objects.equals(arguments, "positive") && i <= 0) {
            System.out.println(varName + " > 0 ! Nhập lại " + varName + ".");
            i = inputInt(varName, arguments);
        }
        return i;
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
}
