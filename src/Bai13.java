public class Bai13 {
    static int n;
    static int[] arr;
    static SharedMethods sm = new SharedMethods();

    static void optimizedInsertionSort(int[] arr) {
        int n = arr.length;

        // Find the minimum element
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        // Place the minimum element at the first position
        int temp = arr[0];
        arr[0] = arr[index];
        arr[index] = temp;

        // Insertion sort with sentinel values and stop the loop early optimization
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            if (j != i - 1) {
                arr[j + 1] = key;
            }
        }
    }
    public static void main(String[] args) {
        n = sm.inputInt("n", "positive");
        arr = sm.inputIntArray(n, "E");
        optimizedInsertionSort(arr);
        System.out.println("Mảng E sau khi sắp xếp:");
        sm.printIntArray(arr);
    }
}
