package quicksort;

import java.util.Queue;

public class RecursiveSum {
    public static int sum(int[] arr, int index) {
        if (index == 0) {
            return arr[index];
        }
        return arr[index] + sum(arr, --index);
    }
}
