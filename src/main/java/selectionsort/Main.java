package selectionsort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 70, 95, 102, 203, 14, 23, 78, 96,96,96};
        SelectionSort.selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

//        System.out.println(arr.length);
    }

}
