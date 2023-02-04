import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bai9 {
    static int n, findNum, index;
    static int[] arr;
    static ArrayList<Integer> indexes;
    static SharedMethods sm = new SharedMethods();

    public static void main(String[] args) {
        n = sm.inputInt("n");
        arr = sm.inputArrOfInt(n, "A");
        findNum = sm.inputInt("số cần tìm trong mảng");
        indexes = sm.findNumberInArr(findNum, arr);
        if (!indexes.isEmpty()) {
            String indexesStr = indexes.stream().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println("Số cần tìm ở vị trí thứ " + indexesStr + " trong mảng");
        } else {
            System.out.println("Không có số cần tìm trong mảng");
        }
    }
}