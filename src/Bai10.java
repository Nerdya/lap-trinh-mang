import java.util.Arrays;

public class Bai10 {
    static int n;
    static int[] arr;
    static SharedMethods sm = new SharedMethods();

    public static float getAvgOfNumbersDividedBy3(int[] arr) {
        int sum = 0, count = 0;
        for (int e : arr) {
            if (e % 3 == 0) {
                sum += e;
                count++;
            }
        }
        return (float) sum / count;
    }

    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        arr = sm.inputIntArray(n, "B");
        Arrays.sort(arr);
        System.out.println("Mảng B:");
        sm.printIntArray(arr);
        System.out.println("Phần tử có giá trị nhỏ nhất: " + arr[0]);
        System.out.printf("Trung bình cộng các phần tử chia hết cho 3: %.2f", getAvgOfNumbersDividedBy3(arr));
    }
}
