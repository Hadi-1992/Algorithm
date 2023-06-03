package quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        recursiveSum
         */
        int[] a = {1, 3, 7, 6, 3};
        System.out.println(RecursiveSum.sum(a, a.length - 1));



        /*
        quickSort
         */
        int arr[] = {1, 2, 12, 4, 70, 13, 25, 14, 90, 15};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

