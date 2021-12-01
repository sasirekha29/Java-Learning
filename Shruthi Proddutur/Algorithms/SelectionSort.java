package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort (int arr[]) {

        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int currentMinimumIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[currentMinimumIndex]) {
                    currentMinimumIndex = j;
                }
            }
            // calling swap() here
            swap(arr, i, currentMinimumIndex);
        }
    }

    public static void swap(int[] arr, int indexOne, int indexTwo) {
        // write swap code here
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }

    public static void main(String args[]) {
        int[] data = { 2, 7, -7, 20, -5 };
        SelectionSort.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}

