public class Bai11 {
    static int n, x;
    static int[] arr;
    static SharedMethods sm = new SharedMethods();
    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        arr = sm.inputIntArr(n, "C");
        x = sm.inputInt("x");

    }
}
