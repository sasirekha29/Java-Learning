package Algorithms;
import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i -1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            //When either of our while loop conditions break it means we have found the position to insert our unsorted element.
            array[j + 1] = current;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {7, 2, 14, -7, 72};
        System.out.println("Array in ascending order");
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
