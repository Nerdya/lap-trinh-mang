package Lab1;

import java.util.Arrays;

public class Bai15 {
    static int n, x;
    static int[] arr;
    static SharedMethods sm = new SharedMethods();

    static void printNthLargestValueWithIndexInIntArray(int nth, int[] arr) {
        SimpleDTO[] dtos = new SimpleDTO[arr.length];
        // Create an array of DTOs and initialize it with the index and value of each element in arr
        for (int i = 0; i < arr.length; i++) {
            dtos[i] = new SimpleDTO(i, arr[i]);
        }

        // Sort the array of DTOs in descending order based on the value of each element
        Arrays.sort(dtos, (a, b) -> b.value - a.value);

        // Get the n-th largest number and its index
        int nthLargestValue = dtos[nth - 1].value;
        int nthLargestIndex = dtos[nth - 1].index;

        System.out.println("Phẩn tử lớn thứ " + nth + " trong mảng có giá trị = " + nthLargestValue +
                " với chỉ mục = " + nthLargestIndex);
    }

    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        arr = sm.inputIntArrayUntilNthElement(n + 1, "A", "1..99", n);
        printNthLargestValueWithIndexInIntArray(1, arr);
        printNthLargestValueWithIndexInIntArray(2, arr);
        sm.optimizedInsertionSort(arr, SortOrder.DESCENDING);
        System.out.println("Mảng A sau khi sắp xếp theo thứ tự giảm dần: ");
        sm.printIntArrayUntilNElement(arr, n);
        x = sm.inputInt("x");
        sm.insertIntoSortedArray(arr, x);
        System.out.println("Mảng A sau khi chèn x:");
        sm.printIntArray(arr);
    }
}
