public class Bai5 {
    static int choice, n;
    static boolean hasValue = false;
    static SharedMethods sm = new SharedMethods();

    static float sum1(int n) {
        float res = 0;
        for (int i = 1; i <= n; i++) {
            res += 1.0 / i;
        }
        return res;
    }

    static float sum2(int n) {
        float res = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            res += 1.0 / factorial;
        }
        return res;
    }

    public static void inputChoice() {
        choice = sm.inputInt("lua chon");
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
                System.out.println("Tổng: 1 + ... + 1/" + n + " = " + sum1(n));
                inputChoice();
                break;
            }
            case 3: {
                if (!hasValue) {
                    System.out.println("Chưa nhập n! Mời bạn nhập lại.");
                    inputChoice();
                    break;
                }
                System.out.println("Tổng: 1 + ... + 1/" + n + "! = " + sum2(n));
                inputChoice();
                break;
            }
            case 4: {
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
        System.out.println("1. Nhập vào số nguyên dương n");
        System.out.println("2. Tinh tổng: 1 + 1/2 + 1/3 + ... + 1/n");
        System.out.println("3. Tính tổng: 1 + 1/2! + 1/3! + ... + 1/n!");
        System.out.println("4. Thoát");
        System.out.println("==========================================");
        inputChoice();
    }
    public static void main(String[] args) {
        menu();
    }
}