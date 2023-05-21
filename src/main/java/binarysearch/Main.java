package binarysearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,24,35,46,58,69,72,84,102};
        int key = 10;
        int index = BinarySearch.binarySearch(arr,key);
        if (index == -1){
            System.out.println("key not found");
        }else {
            System.out.println("your key is in index:\t"+index);
        }
    }
}
