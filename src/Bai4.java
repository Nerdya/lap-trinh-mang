import java.util.Scanner;

public class Bai4 {
    static int soDien, tienDien;
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập vào số điện: ");
        soDien = sc.nextInt();
        if (soDien <= 50) {
            tienDien = soDien * 5000;
        } else {
            tienDien = 50 * 5000 + (soDien - 50) * 1200;
        }
        System.out.println("Tiền điện của tháng là: " + tienDien);
    }
}