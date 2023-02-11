package Lab1;

public class Bai17 {
    static int rows, columns;
    static int[][] arr2D;
    static SharedMethods sm = new SharedMethods();
    public static void main(String[] args) {
        rows = sm.inputInt("số hàng", "positive");
        columns = sm.inputInt("số cột", "positive");
        arr2D = sm.inputIntArray2D(rows, columns, "A2");
    }
}
