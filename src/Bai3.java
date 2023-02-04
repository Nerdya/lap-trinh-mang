import java.util.Objects;
import java.util.Scanner;

public class Bai3 {
    static int a, b, c, delta;
    public static final Scanner sc = new Scanner(System.in);

    public static int inputInt(String varName, String arguments) {
        int i;
        System.out.print("Nhập " + varName + ": ");
        i = sc.nextInt();

        if (Objects.equals(arguments, "notZero") && i == 0) {
            System.out.println(varName + " != 0 ! Nhập lại " + varName + ".");
            i = inputInt(varName, arguments);
        }
        return i;
    }

    public static int inputInt(String varName) {
        return inputInt(varName, "");
    }

    public static void main(String[] args) {
        a = inputInt("a", "notZero");
        b = inputInt("b");
        c = inputInt("c");
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("PT vô nghiệm");
        } else if(delta == 0) {
            float x = (float) -b / (2 * a);
            System.out.printf("PT có nghiệm kép x1 = x2 = %.2f", x);
        } else {
            float x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("PT có 2 nghiệm phân biệt:");
            System.out.printf("\tx1 = %.2f\n", x1);
            System.out.printf("\tx2 = %.2f\n", x2);
        }
    }
}
