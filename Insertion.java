import java.util.*;

public class Solution {

    public static void insertionSort(int n, int[] arr) {
        int key = arr[n - 1];   // last element
        int i = n - 2;

        // shift elements greater than key to the right
        while (i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i];

            // print array after each shift
            printArray(arr);

            i--;
        }

        // insert the key at correct position
        arr[i + 1] = key;

        // print final array
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(n, arr);
    }
}
